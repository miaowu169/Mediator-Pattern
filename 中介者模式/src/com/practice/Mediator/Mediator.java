package com.practice.Mediator;

import java.util.ArrayList;
import java.util.List;

import com.practice.User.Player;

public abstract class Mediator {
	List<Player> list = new ArrayList<>();//所有在聊天室里的人存这
	public abstract void sendToAll(String msg,String name);//群发
	public abstract void sendToPerson(String msg,String toName,String fromName);//给某个人发送信息
	public abstract void join(Player player);//用户加入聊天室
	public abstract void leave(Player player);//用户离开聊天室
}
