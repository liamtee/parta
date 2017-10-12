//Liam Thaker 14494722


import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class Programme {
	
	private String programmeName;
	ArrayList<Module> listOfModules = new ArrayList<Module>();
	//private String[] listOfModules;
	private DateTime start, end;
	
	public Programme(String programmeName, ArrayList<Module> listOfModules, DateTime start, DateTime end) {
		this.programmeName = programmeName;
		this.listOfModules = listOfModules;
		this.start = start;
		this.end = end;
	}
	
	public String getProgrammeName() {
		return programmeName;
	}
	
	public ArrayList<Module> getListOfModules() {
		return listOfModules;
	}
	
	public DateTime getStartDate() {
		return start;
	}
	
	public DateTime getEndDate() {
		return end;
	}
	
	public void setProgrammeName(String newName) {
		programmeName = newName;
		
	}
	
	public void setListOfModules(ArrayList<Module> newModules) {
		listOfModules = newModules;
		
	}
	
	public void setStartDate(DateTime newStart) {
		start = newStart;
		
	}
	
	public void setEndDate(DateTime newEnd) {
		end = newEnd;
	}

	public String toString(){
		return "Programme: " + programmeName + "\n" + "Start Date: " + start + " " + "End Date: " + end + " \nModules:" + listOfModules;
	}
}
