package ThursdayTest;

public class Keyword {
    

        // Define the non-static function
        public void iterateAndPrintNumbers() {
            // Create an array of numbers
            int[] numbers = {1, 2, 3, 4, 5};
    
            // Use a for loop to iterate through the array
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        }
    
        // Main method to call the function
        public static void main(String[] args) {
            // Create an instance of the Main class
            Keyword mainInstance = new Keyword();
    
            // Call the non-static function
            mainInstance.iterateAndPrintNumbers();
        }
    }
    
    
        

