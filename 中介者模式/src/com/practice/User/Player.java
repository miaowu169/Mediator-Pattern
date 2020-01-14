package com.practice.User;

import com.practice.Mediator.Mediator;

public class Player {
	public Mediator mediator;
	public String name;
	//在创建对象的时候就把他的中介者传入，他要发送 的都通过这个中介者完成
	public Player(String name,Mediator mediator) {
		this.mediator = mediator;
		this.name = name;
	}
	//给所有人发送信息
	public void sendtoAll(String msg,String name) {
		mediator.sendToAll(msg,name);
	}
	//给某人发送信息
	public void sendToPerson(String msg,String toName,String fromName) {
		mediator.sendToPerson(msg,toName,fromName);
	}
	//接收信息
	public void accept(String msg,String fromName) {
		System.out.println("[" + this.name + "]收到消息:(" + fromName + ")" + msg);
	}
	//加入聊天室
	public void join() {
		mediator.join(this);
	}
	//离开聊天室
	public void leave() {
		mediator.leave(this);
	}
}
