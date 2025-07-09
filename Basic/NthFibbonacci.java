import java.util.Scanner;

public class NthFibbonacci {
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n to find nth Fibonacci number: ");
      int n=sc.nextInt();

      /* Fibonacci series is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.
         The series goes like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
         To find the nth Fibonacci number:
         if(n<=1) return 1
         int n1,n2=0, n2=1
         for(2 to n){
         n3 = n1+n2
         n1=n2
         n2=n3
         }
         return n3
      */

      if (n <= 1) {
          System.out.println("Fibonacci number at position " + n + " is: " + n);
      } else {
          int n1 = 0, n2 = 1, n3 = 0;
          for (int i = 2; i <= n; i++) {
              n3 = n1 + n2;
              n1 = n2;
              n2 = n3;
          }
          System.out.println("Fibonacci number at position " + n + " is: " + n3);
      }
  }
}
