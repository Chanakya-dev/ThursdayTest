package ThursdayTest;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner s1 =new Scanner(System.in);

        System.out.println("Enter your age");
        int age =s1.nextInt();

        if (age<18) {
            System.out.println("You are eligible for vote");
            
        } else {
            System.out.println("You are not eligible for vote");
        }

        
        


    }
    
}
