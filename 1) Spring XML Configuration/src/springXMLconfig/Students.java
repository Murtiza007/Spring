package springXMLconfig;

public class Students {

	private String name;
	private String address;
	private int roll_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public void display() {
		
		System.out.println(roll_no);
		System.out.println(name);
		System.out.println(address);
	}
	
	
}
