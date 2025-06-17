package SpringAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employees {
	
	@Value("101")
	private int emp_id;
	@Value("MOIN")
	private String emp_name;
	@Value("CSE")
	private String emp_dept;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
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
		
	}
}
