//Write a program to check if a even number is palindrome or not - Day 3 Assignment
import java.util.*;
public class Palindrome 
{
  public static void main(String[] args)
  {
    int n, temp, sum = 0, rem;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a Number to check if it is a palindrome"); 
      n = sc.nextInt();
      temp = n;
      String original, reverse = "";  
      
      original = sc.nextLine(); 
      while (temp != 0) 
      {
        rem = temp % 10;
        sum = sum * 10 + rem;
        temp = temp / 10;
      }
 
      if (n == sum)
       {
         if(n%2==0)
          {
           
            System.out.println("even");
            
            int length = original.length();   
        for ( int i = length - 1; i >= 0; i-- )  
           reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))  
           System.out.println("Number is a palindrome.");  
          
              
          }
          else
          {
            System.out.println("odd");
          }
       }
       else
       {
         System.out.println("not palindrome");
       }
    }
 
   }
}