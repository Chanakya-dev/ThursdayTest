package ThursdayTest;

import java.util.Scanner;

public class Swaroopa {
    public void m3(int age){
        if (age>=18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int age = in.nextInt();
        Swaroopa n=new Swaroopa();
        n.m3(age);
    }
    
}
