import java.util.Scanner;
public class ifelse1 {
    public int check1(int age){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter age:");
          age=sc.nextInt();
        if (age>18){
        System.out.println(age +":>=18");}
        else
        System.out.println(age +":<18");
        return age; 

    }
    public static void main(String[] args) {
        ifelse1 c=new ifelse1();
        
        int a=c.check1(5);
    }

    
}
