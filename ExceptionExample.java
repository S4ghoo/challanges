public class ExceptionExample {
 public static void main(String[] args) {
 try {
 int result = 10 / 0; // ArithmeticException
 } catch (ArithmeticException e) {
 System.out.println("Error: Division by zero!");
 } finally {
 System.out.println("This code runs no matter what.");
 }
 }
 }