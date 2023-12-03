package Participants;
import Tools.Measurable;


public class Dancer extends Person implements Measurable{
    private int age;
    private String danceLevel;  
    
    // Constructors
    public Dancer(){
    }
    public Dancer (int age, String fName, String lName, String danceLevel){
        super(fName, lName);
        this.age = age;
        this.danceLevel = danceLevel;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
		this.age = age;
	}
    
    public String getDanceLevel() {
        return danceLevel;
    }

    public void setDanceLevel(String danceLevel) {
        this.danceLevel = danceLevel;
    }

    @Override
    public String toString(){
        return "Age: " + this.getAge() + " Name: " + this.getfName() + " " + this.getlName() + " Dance level: " + this.getDanceLevel();
    }

	@Override
	public int getMeasure() {
		return this.age;
	}



}
