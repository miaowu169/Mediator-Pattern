package com.practice.client;

import com.practice.Mediator.ChatPlatform;
import com.practice.Mediator.Mediator;
import com.practice.User.Player;

public class Client {
	public static void main(String[] args) {
		Mediator chatPlatform = new ChatPlatform();
		Player a = new Player("妙乌",chatPlatform);
		Player b = new Player("蒸血Stack",chatPlatform);
		Player c = new Player("美团骑手牛笔",chatPlatform);
		Player d = new Player("吗咿呀嘿",chatPlatform);
		b.join();
		c.join();
		d.join();
		System.out.println("--------妙乌进入聊天室- - - - - - - - - - - -");
		a.join();
		System.out.println("------------妙乌群发消息- - - - - - - - - - - - - - -");
		a.sendtoAll("有需要上分的么？差个辅助",a.name);
		System.out.println("------------妙乌给\"蒸血Stack\"私发信息- - - - - - - - - - - - - -");
		a.sendToPerson("小老弟，一起来开黑", b.name,a.name);
		System.out.println("--------妙乌离开聊天室- - - - - - - - - - -");
	}
}
