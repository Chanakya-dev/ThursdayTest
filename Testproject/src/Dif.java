import java.util.Scanner;

public class Dif {
    public void m4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        Dif obj = new Dif();
        obj.m4();
    }
}