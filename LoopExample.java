package ThursdayTest;
public class LoopExample {

    
    public void iterate(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println( + i);
        }
    }

    public static void main(String[] args) {
        
        LoopExample example = new LoopExample();
        
        
        example.iterate(5); 
    }
}
