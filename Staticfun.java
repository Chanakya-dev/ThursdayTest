package ThursdayTest;

import java.util.Scanner;

public class Staticfun {
    public static String age(int a){
        if(a>18){
            return "eligible";
        }
        else{
            return "not eligible";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int a = sc.nextInt();
        System.out.println(Staticfun.age(a));
    
    }
    
}
