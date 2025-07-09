import java.util.Scanner;

public class SumOfOneToNDivisor{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n to find armstrong number: ");
      int n=sc.nextInt();

      /* 
      Given a positive integer n, The task is to find the value of Σi F(i) where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.
      for eg. -Input: n = 4
      Output: 15
      Explanation:
      F(1) = 1
      F(2) = 1 + 2 = 3
      F(3) = 1 + 3 = 4
      F(4) = 1 + 2 + 4 = 7
      So, F(1) + F(2) + F(3) + F(4)
          = 1 + 3 + 4 + 7 = 15

      approach - long sum=0
      for(i=1 to n){
      sum +=Math.floor(n/i) * i;
      }
      return sum;
      */

      long sum=0;
      for(long i=1;i<=n;i++){
          sum += Math.floor(n/i) * i;
      }
      System.out.println("The sum of divisors from 1 to " + n + " is: " + sum);
  }
}
