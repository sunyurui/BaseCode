package com.coffee.Socket;

import java.util.Vector;

public class ChatManager {
	private ChatManager() {}
	private static final ChatManager cm=new ChatManager();
	public static ChatManager getChatManager() {
		return cm;
	}
	Vector<ChatSocket> vector=new Vector<ChatSocket>();
	public void add(ChatSocket cSocket) {
		vector.add(cSocket);
	}
	public void publish(ChatSocket cs,String out) {
		for (int i = 0; i < vector.size(); i++) {
			ChatSocket cSocket=vector.get(i);
			if (!cs.equals(cSocket)) {
				cSocket.out1(out);
			}
		}
	}

}