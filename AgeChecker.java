package ThursdayTest;
import java.util.Scanner;

public class AgeChecker {

    
    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("Age is above 18.");
        } else {
            System.out.println("Age is 18 or below.");
        }
    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int age=a.nextInt();
        checkAge(age);
        
    
    }
}
