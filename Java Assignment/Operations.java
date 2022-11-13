//Write a program to divide, multiply, subtract and addition of two numbers - Day 3 assignment
import java.util.Scanner;
 
public class Operations {
 
 public static void main(String[] args) {
  try (Scanner in = new Scanner(System.in)) {
    System.out.print("\nFirst number: ");
      int num1 = in.nextInt();
       
      System.out.print("\nSecond number: ");
      int num2 = in.nextInt();
        
      System.out.println( "\nDivion " +"("+ num1 + " / " + num2 +")"+ " = " + 
      (num1 / num2));
     
      System.out.println("\nMultiplication " + "(" + num1 + " x " + num2 + ")"+" = " + 
      (num1 * num2));
      
      System.out.println("\nDifference "+ "(" + num1 + " - " + num2 +" )" +" = " + 
      (num1 - num2));
       
      System.out.println("\nsum  " + "("+num1 + " + " + num2 +")"+ " = " + 
      (num1 + num2));
}
  
 }
 
}
