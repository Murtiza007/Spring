package Beans;

public class Department {

	private String dept_id;
	private String emp_salary;
	private String emp_proj;
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}
	public String getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_proj() {
		return emp_proj;
	}
	public void setEmp_proj(String emp_proj) {
		this.emp_proj = emp_proj;
	}
	
	public String toString() {
		
		return dept_id+","+emp_salary+","+emp_proj;
	}
	
	
	
	
}
