package Participants;

import Tools.Measurable;


public class Coach extends Person implements Measurable{
	private String studio;
	private String city;
	private int numberOfStudents;
	
	
	public Coach() {
		super();
	}
	
	public Coach(String fName, String lName, String studio, String city) {
		super(fName, lName);
		this.studio = studio;
		this.city = city;
		this.numberOfStudents = 0;
	}

	public String getStudio() {
		return studio;
	}
	public void setStudio(String studio) {
		this.studio = studio;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void incrementNumberOfStudents() {
		this.numberOfStudents++;
	}
	public void decrementNumberOfStudents() {
		this.numberOfStudents--;
	}

	@Override
	public int getMeasure() {
		return numberOfStudents;
	}
	public String toString() {
		return "Coach: " + this.getfName() + " " + this.getlName() +" Studio name: " + this.getStudio() + " City: " + this.getCity();
	}
	

}
