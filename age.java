
import java.util.Scanner;

public class age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        check(age);

    }

  public static void check(int age)
 {
    if(age>=18){
        System.out.println("above 18");
    }
    else{
        System.out.println("not above 18");
    }
 }
    
}

