package com.practice.Mediator;

import com.practice.User.Player;

public class ChatPlatform extends Mediator {

	@Override
	public void sendToAll(String msg,String name) {
		for(Player play:list) {
			if(play.name.equals(name)) {
				return;
			}
			play.accept(msg,name);
		}
	}

	@Override
	public void sendToPerson(String msg, String Toname,String fromName) {
		for(Player player:list) {
			if(player.name.equals(Toname)) {
				player.accept(msg,fromName);
			}
		}
	}

	@Override
	public void join(Player player) {
		list.add(player);
	}

	@Override
	public void leave(Player player) {
		list.remove(player);
	}

}
