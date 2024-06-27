public class Loop {
    public static void loop(){
        for(int i=1; i<=10;i++){
         if(i%3==0){
            System.out.println(i);
         }
        }
        
    }
    public static void main(String[] args) {

        Loop l = new Loop();
        loop();
        
        
    }
    
}
