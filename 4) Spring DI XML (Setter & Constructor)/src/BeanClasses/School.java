package BeanClasses;

public class School {

	private String sc_name;
	private String sc_class;
	private String sc_section;
	
	public School(String sc_name, String sc_class, String sc_section) {
	
		this.sc_name = sc_name;
		this.sc_class = sc_class;
		this.sc_section = sc_section;
	}
	@Override
	public String toString() {
		return sc_class+","+sc_name+",sc_section";
		
		
	}
	
	
}
