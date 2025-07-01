package Beans;

public class Address {

	private String lane;
	private String pin;
	private String town;
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	
	public String toString() {
		
		return lane+","+pin+","+town;
	}
}
