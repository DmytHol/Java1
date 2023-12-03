import Participants.Couple;
import Participants.Dancer;

public class Main {
    public static void main(String[] args) {


        Dancer d1 = new Dancer(10, "John", "Doe", "Beginner");
        Dancer d2 = new Dancer( 20, "Jane", "Doe", "Intermediate");

        Couple c1 = new Couple( d1, d2);


        System.out.println(c1.toString());

    }
}