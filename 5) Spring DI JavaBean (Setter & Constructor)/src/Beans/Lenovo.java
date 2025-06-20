package Beans;

public class Lenovo {
	
	private String model;
	private String price;
	private Intel intel;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Intel getIntel() {
		return intel;
	}
	public void setIntel(Intel intel) {
		this.intel = intel;
	}
	
	public void display() {
		
		System.out.println(model);
		System.out.println(price);
		System.out.println(intel);
	}

}
