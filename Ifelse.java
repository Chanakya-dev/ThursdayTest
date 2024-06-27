public class Ifelse {
    public static void main(String[] args) {
        ifAge(age:25);
        ifAge(age:75);
    }
    public static void ifAge(int age) {
        if (age > 18) {
            System.out.println("Age " + age + " is above 18.");
        } 
        else {
        System.out.println("Age " + age + " is not above 18.");
        }
    }
}

