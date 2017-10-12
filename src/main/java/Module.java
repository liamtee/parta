//Liam Thaker 14494722


import java.util.ArrayList;

public class Module {

	private String moduleName, id;
	//private Student[] pupilList;
	ArrayList<Student> pupilList = new ArrayList<Student>();
	
	public Module(String id, String moduleName, ArrayList<Student> pupilList) {
		this.id = id;
		this.moduleName = moduleName;
		this.pupilList = pupilList;
	}
	
	public String getID() {
		return id;
	}
	
	public String getModuleName() {
		return moduleName;
	}
	
	public ArrayList<Student> getPupilList() {
		return pupilList;
	}
	
	public void setID(String newId) {
		id = newId;
	}
	
	public void setModuleName(String newName) {
		moduleName = newName;
	}
	
	public void setPupilList(ArrayList<Student> newList) {
		pupilList = newList;
	}
	
	public String toString(){
		return "\n  " + id + " " + moduleName + " " + pupilList;
	}
	
}
