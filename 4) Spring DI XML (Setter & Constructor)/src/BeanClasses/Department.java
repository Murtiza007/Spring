package BeanClasses;

public class Department {

	private String emp_dept;
	private String emp_salary;
	private String emp_experience;
	
	public String getEmp_dept() {
		return emp_dept;
	}
	public void setEmp_dept(String emp_dept) {
		this.emp_dept = emp_dept;
	}
	public String getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(String emp_salary) {
		this.emp_salary = emp_salary;
	}
	public String getEmp_experience() {
		return emp_experience;
	}
	public void setEmp_experience(String emp_experience) {
		this.emp_experience = emp_experience;
	}
	
	@Override
	public String toString() {
		return emp_dept+","+emp_salary+","+emp_experience;
		
	}
}
