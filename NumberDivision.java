public class NumberDivision {

    
    public static void parseAndDivide(String num1, String num2) {
        try {
            
            int number1 = Integer.parseInt(num1);
            try {
                
                int number2 = Integer.parseInt(num2);
                int result = number1 / number2;
                System.out.println(result); 
            } catch (NumberFormatException e) {
                
                System.out.println("Invalid input. Please enter valid numbers.");
            } catch (ArithmeticException e) {
                
                System.out.println("Cannot divide by zero.");
            }
        } catch (NumberFormatException e) {
            
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        // Test cases
        parseAndDivide("10", "2");   // Expected Output: 5
        parseAndDivide("ten", "2");   // Expected Output: Invalid input. Please enter valid numbers.
        parseAndDivide("10", "0");    // Expected Output: Cannot divide by zero.
    }
}
