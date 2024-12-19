import java.util.*;
public class pradeep2 {
    void main(int age)
    {
        if(age>18)
        System.out.println("yes");
        else
        System.out.println("no");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pradeep2 pr = new pradeep2();
        int age = sc.nextInt();
        pr.main(age);
    }
}
