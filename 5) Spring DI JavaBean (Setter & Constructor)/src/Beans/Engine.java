package Beans;

public class Engine {

	private String cylinders;
	private String torque;
	private String fuel;
	
	public Engine(String cylinders, String torque, String fuel) {
		
		this.cylinders = cylinders;
		this.torque = torque;
		this.fuel = fuel;
	}

	public String getCylinders() {
		return cylinders;
	}

	public String getTorque() {
		return torque;
	}

	public String getFuel() {
		return fuel;
	}
	
	public String toString() {
		return cylinders+","+torque+","+fuel;
	}
	
}
