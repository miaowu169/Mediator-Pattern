package com.practice.Mediator;

import java.util.ArrayList;
import java.util.List;

import com.practice.User.Player;

public abstract class Mediator {
	List<Player> list = new ArrayList<>();//����������������˴���
	public abstract void sendToAll(String msg,String name);//Ⱥ��
	public abstract void sendToPerson(String msg,String toName,String fromName);//��ĳ���˷�����Ϣ
	public abstract void join(Player player);//�û�����������
	public abstract void leave(Player player);//�û��뿪������
}
