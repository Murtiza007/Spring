package in.sp.beans;

public class users {
 private String username;
 private String email;
 private String address;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 public void display() {
	 
	 System.out.println("Username="+username);
	 System.out.println("Email="+email);
	 System.out.println("Address="+address);
 }
}
