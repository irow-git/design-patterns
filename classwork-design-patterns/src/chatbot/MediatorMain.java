package chatbot;

public class MediatorMain {

	
	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Maria");
		User user3 = new ChatUser(chat, "Peter");
		
		user2.send("Hi, guys");
		user1.send("addBot");
		user3.send("cat");
		user3.send("wtf");
		user1.send("this guy lol");

	}

}