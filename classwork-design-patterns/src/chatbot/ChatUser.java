package chatbot;

public class ChatUser extends User {

	
	public ChatUser(MessageMediator mediator, String name) {
		super(mediator, name);
		mediator.addUser(this);
	}

	@Override
	public void send(String message) {

		System.out.println(this.name + " sends: " + message);
		this.mediator.sendMessage(message, this);

		
	}

	@Override
	public void receive(String message) {
		System.out.println(this.name + " received: " + message);
	}

}