package Beans;

public class Employee {

	private String emp_name;
	private String emp_id;
	private String emp_dept;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public void display() {
		
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(emp_dept);
		System.out.println(address);
	}
	
}
