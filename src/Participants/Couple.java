package Participants;


import Tools.DataSetGeneric;
import Tools.Measurable;


public class Couple implements Measurable{
    private DataSetGeneric<Person> couple = new DataSetGeneric<>();
    private Coach coach;
    
    public Couple(){
    	
    }
    public Couple(Dancer d1, Dancer d2){
    	couple.add(d1);
        couple.add(d2);
    }

    public Couple(Dancer d1, Dancer d2, Coach c){
    	couple.add(d1);
        couple.add(d2);
        coach = c;
    }


    public DataSetGeneric<Person> getCouple() {
		return couple;
	}

	public void setCouple(DataSetGeneric<Person> couple) {
		this.couple = couple;
	}
	
	
	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public boolean add(Person person) {
	    boolean isAdded = false;

	    if (person instanceof Dancer) {
	        if (couple.size() < 2) {
	            couple.add((Dancer) person);
	            isAdded = true;
	        } else {
	            System.out.println("Couple already has two dancers");
	        }
	    } else if (person instanceof Coach) {
	        Coach coach = (Coach) person;
	        if (!couple.contains(coach)) {
	            couple.add(coach);
	            coach.incrementNumberOfStudents();
	            isAdded = true;
	        } else {
	            System.out.println("This coach is already added to the couple");
	        }
	    } else {
	        System.out.println("Invalid person type");
	    }

	    return isAdded;
	}
	
	public boolean addCoach(Coach coach) { 
		boolean isAdded;
		if (couple.contains(coach)) {
			isAdded = false;
			System.out.print("This coach is already added");
		}
		else {
			couple.add(coach);
			coach.incrementNumberOfStudents();
			isAdded = true;
			
		}
		
		return isAdded;
	}
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Couple:\n");
	    for (Person person : couple) {
	        if (person instanceof Coach) {
	            sb.append("\tCoach: ").append(person.toString()).append("\n");
	        } else {
	            sb.append("\tDancer: ").append(person.toString()).append("\n");
	        }
	    }
	    return sb.toString();
	}
	
	//returns the age of oldest dancer in couple
	@Override
	public int getMeasure() {
	    int highestAge = 0;

	    for (Person person : couple) {
	        if (person instanceof Dancer) {
	            Dancer dancer = (Dancer) person;
	            int age = dancer.getAge();
	            if (age > highestAge) {
	                highestAge = age;
	            }
	        }
	    }

	    return highestAge;
	}
}
