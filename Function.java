public class Function {
    public void call(){
        int n=8;
        if(n%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Function f = new Function();
        f.call();
    }
    
}
