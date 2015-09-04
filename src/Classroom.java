/**
 * Created by 2018514 on 9/3/15.
 */
import java.util.*;
public class Classroom {
    public static void main(String [] args) {
        Student student;
        Scanner keyboard = new Scanner(System.in);
        double sc1,sc2,sc3;

        System.out.println("Enter score 1: ");
        sc1 = keyboard.nextDouble();
        System.out.println("Enter score 2: ");
        sc2 = keyboard.nextDouble();
        System.out.println("Enter score 3: ");
        sc3 = keyboard.nextDouble();

        student = new Student(sc1,sc2,sc3);

        Syestem.out.println("Score 1: " + sc1 + "\nScore 2: " + sc2 + "\nScore 3: " + sc3 + "\nAverage: " student.getAverage());





    }
}
