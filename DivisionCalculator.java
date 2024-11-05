public class DivisionCalculator{
  public static void main(String[] args){
    System.out.println("Input: divideNumbers(10, 2) → Output: " + divideNumbers(10, 2));
    System.out.println("Input: divideNumbers(10, 0) → Output: " + divideNumbers(10, 0));
  
  }
  public static int divideNumbers(int a, int b) {
    try {
        return a / b;
    } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero.");
        return 1; 
    }
}
  
}