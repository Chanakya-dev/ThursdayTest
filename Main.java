public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int age = 20;
        main.checkAge(age); 
    }
    public void checkAge(int age) {
        if (age > 18) {
            System.out.println("Age is above 18.");
        } else {
            System.out.println("Age is 18 or  may be below.");
        }
    }
}
