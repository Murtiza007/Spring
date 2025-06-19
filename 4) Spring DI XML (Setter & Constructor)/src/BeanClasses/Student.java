package BeanClasses;

public class Student {

	private String std_id;
	private String std_name;
	private School school;

	public Student(String std_id,String std_name,School school) {
		this.std_id=std_id;
		this.std_name=std_name;
		this.school=school;
		
	}
	public void display() {
		
		System.out.println(std_id);
		System.out.println(std_name);
		System.out.println(school);
	}

}

