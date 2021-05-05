package chatbot;

public abstract class User {
	
	protected String name;
	protected MessageMediator mediator;

	public User(MessageMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void send(String message);
	
	public abstract void receive(String message);
}
