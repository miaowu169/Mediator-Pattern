package com.practice.client;

import com.practice.Mediator.ChatPlatform;
import com.practice.Mediator.Mediator;
import com.practice.User.Player;

public class Client {
	public static void main(String[] args) {
		Mediator chatPlatform = new ChatPlatform();
		Player a = new Player("����",chatPlatform);
		Player b = new Player("��ѪStack",chatPlatform);
		Player c = new Player("��������ţ��",chatPlatform);
		Player d = new Player("����ѽ��",chatPlatform);
		b.join();
		c.join();
		d.join();
		System.out.println("--------���ڽ���������- - - - - - - - - - - -");
		a.join();
		System.out.println("------------����Ⱥ����Ϣ- - - - - - - - - - - - - - -");
		a.sendtoAll("����Ҫ�Ϸֵ�ô���������",a.name);
		System.out.println("------------���ڸ�\"��ѪStack\"˽����Ϣ- - - - - - - - - - - - - -");
		a.sendToPerson("С�ϵܣ�һ��������", b.name,a.name);
		System.out.println("--------�����뿪������- - - - - - - - - - -");
	}
}
