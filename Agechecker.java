import java.util.Scanner;

public class Agechecker {

    
    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("Age is above 18.");
        } else {
            System.out.println("Age is 18 or below.");
        }
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        checkAge(age);

        
        scanner.close();
    }
}



