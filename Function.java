import java.util.Scanner;

public class Function {
    public void call(){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n>=18){
            System.out.println("Age is Greater than 18");
        }
        else{
            System.out.println("Age is Less than 18");
        }
    }
    public static void main(String[] args) {
        Function f = new Function();
        f.call();
    }
    
}
