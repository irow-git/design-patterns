package chatbot;

public class SingletonBot {

	private static SingletonBot instance;
	private String bannedWord = "cat";
	
	private SingletonBot() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonBot getInstance() {
		
		if(instance == null) {
			instance = new SingletonBot();
		}
		
		return instance;
	}
	
	public void postMessage(String message,User user, Chat chat) {
		if(bannedWord.equals(message.toLowerCase())) {
			chat.removeUser(user);
			for(User chatUser: chat.getUsers()) {
				chatUser.receive(user.name + " has been banned.");
				chatUser.receive("cat" + " is a banned word.");				
			}
		}
	}
}
