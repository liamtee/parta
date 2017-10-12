// Liam Thaker 14494722


public class Student {
	
	private String name, DOB, email, username;
	private int age, ID;
	
	// name, age, DOB, ID, email 
	public Student(String name, int age, String DOB, int ID, String email) {
		this.name = name;
		this.age = age;
		this.username = (name + age).replaceAll("\\s+","").toLowerCase();
		this.DOB = DOB;
		this.ID = ID;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setDOB(String newDOB){
		DOB = newDOB;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}
	
	public void setID(int newID){
		ID = newID;
	}
	
	public void setUsername(int newID){
		ID = newID;
	}
	
	public String toString(){
		return "\n   Student: " + name + " ID: " + ID + " Username: " + username + " DOB: " + DOB + " Email: " + email;
	}
}
