package observer;

public class Main {

	public static void main(String[] args) {

		PushPrice price = new PushPrice();

		Observer obs1 = new Person("01", "painting");
		Observer obs2 = new Person("02", "painting");

		price.add(obs1);
		price.add(obs2);

		price.setPrice("250lv");
		price.setPrice("350lv");

	}

}