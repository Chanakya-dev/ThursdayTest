import java.util.Scanner;

public class swapnaif {
    public static void m3(int age ) {

        if  (age>=18) {
        System.out.println( "eligible");
           }
        else {
        System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in .nextInt();
        m3(age);
    }
}


