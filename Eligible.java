public class Eligible {
    public static void main(String[] args) {
        int age = 20;
        checkAge(age);
    }

    public static void checkAge(int age) {
        if (age > 18) {
            System.out.println("Age is above 18.");
        } else {
            System.out.println("Age is 18 or maybe below");
        }
    }
}
