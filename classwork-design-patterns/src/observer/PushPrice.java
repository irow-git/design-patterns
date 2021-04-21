package observer;

import java.util.ArrayList;
import java.util.List;

public class PushPrice implements Observable{

	private List<Observer> observers;
	private String price;

	public PushPrice() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void add(Observer observer) {
		this.observers.add(observer);
		observer.setPrice(this);
	}

	@Override
	public void remove(Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.price;
	}

	public void setPrice(String newPrice) {
		this.price = newPrice;
		this.notifyObservers();
	}

}