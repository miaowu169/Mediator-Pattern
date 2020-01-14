package com.practice.User;

import com.practice.Mediator.Mediator;

public class Player {
	public Mediator mediator;
	public String name;
	//�ڴ��������ʱ��Ͱ������н��ߴ��룬��Ҫ���� �Ķ�ͨ������н������
	public Player(String name,Mediator mediator) {
		this.mediator = mediator;
		this.name = name;
	}
	//�������˷�����Ϣ
	public void sendtoAll(String msg,String name) {
		mediator.sendToAll(msg,name);
	}
	//��ĳ�˷�����Ϣ
	public void sendToPerson(String msg,String toName,String fromName) {
		mediator.sendToPerson(msg,toName,fromName);
	}
	//������Ϣ
	public void accept(String msg,String fromName) {
		System.out.println("[" + this.name + "]�յ���Ϣ:(" + fromName + ")" + msg);
	}
	//����������
	public void join() {
		mediator.join(this);
	}
	//�뿪������
	public void leave() {
		mediator.leave(this);
	}
}
