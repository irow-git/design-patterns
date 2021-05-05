package chatbot;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private SingletonBot chatBot;
	
	public Chat() {
		this.users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		
		
		if(chatBot != null)
		chatBot.postMessage(message, user, this);	
		
		for(User chatUser: this.users) {
			// Skip the one who sends the message
			if(chatUser != user && this.users.contains(user) == true) {			
				chatUser.receive(message);
			}
		}

		if(message == "addBot") {
			chatBot = SingletonBot.getInstance();
			for(User chatUser: this.users) {
				if(chatUser != user && this.users.contains(user) == true) {
					chatUser.receive(user.name + " added a bot");
				}
			}
		}
		
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
	@Override
	public void removeUser(User user) {
		this.users.remove(user);
	}
	
	public List<User> getUsers() {
		return this.users;
	}

}
