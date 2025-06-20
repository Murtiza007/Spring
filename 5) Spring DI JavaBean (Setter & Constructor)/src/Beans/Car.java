package Beans;

public class Car {
	
	private String Model;
	private String Price;
	private Engine engine;
	
	
	public Car(String model, String price, Engine engine) {
		Model = model;
		Price = price;
		this.engine = engine;
	}
	
	public String getModel() {
		return Model;
	}
	public String getPrice() {
		return Price;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public void display()
	{
		System.out.println(Model);
		System.out.println(Price);
		System.out.println(engine);
	}	
	

}
