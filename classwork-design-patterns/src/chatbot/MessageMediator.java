package chatbot;

public interface MessageMediator {
	void sendMessage(String message, User user);
	void addUser(User user);
	void removeUser(User user);
}