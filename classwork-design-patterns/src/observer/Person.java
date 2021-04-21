package observer;

public class Person implements Observer{

	private String name;
	private String itemName;
	private Observable price;

	public Person(String name, String itemName) {
		this.name = name;
		this.itemName = itemName;
	}

	@Override
	public void update() {

		if(this.price == null) {
			System.out.println(this.getName() + " is not listed");
			return;
		}

		String newPrice = this.price.getUpdate();
		System.out.println(this.getName() + " " + itemName + " " + newPrice);

	}

	@Override
	public void setPrice(Observable itemPrice) {
		this.price = itemPrice;
	}

	public String getName() {
		return name;
	}
	public String getItemName() {
	 return itemName;
	}

}