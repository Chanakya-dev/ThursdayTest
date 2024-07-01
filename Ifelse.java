package ThursdayTest;

import java.util.Scanner;

public class Ifelse {
  
    public void  m2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        
        if(age>18){
            System.out.print("you are eligible");
        }
        else{
            System.out.print("you are not eligible");
        }

        

        }
        public static void main(String[] args) {
            Ifelse p2 = new Ifelse();
            p2.m2();

        
            
        }
            
            
}