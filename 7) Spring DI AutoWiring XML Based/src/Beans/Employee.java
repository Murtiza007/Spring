package Beans;

public class Employee {
	
	private String emp_id;
	private String emp_name;
	private Department department;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	

	
	public void display() {
		System.out.println(emp_id);	
		System.out.println(emp_name);	
		System.out.println(department);	
	}

}
