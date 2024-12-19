import java.util.Scanner;

public class Test {
    public void m1(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age ");
        int age=sc.nextInt();
        if (age>18) {
            System.out.println("eligible for vote");
        
            } else {
      
                System.out.println("not eligible for vote");
    }
}
    public static void main(String[] args) {
        Test obj=new Test();
        obj.m1();
    }
}
        
