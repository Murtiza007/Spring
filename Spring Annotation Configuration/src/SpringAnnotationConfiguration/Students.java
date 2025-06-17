package SpringAnnotationConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Students {
	
	@Value("Ahmad")
	private String Name;
	@Value("102")
	private String Id;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public void display() {
		
		System.out.println(Name);
		System.out.println(Id);
	}
}
