import java.util.Scanner;

public class Armstrong{
  
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of n to find armstrong number: ");
      int n=sc.nextInt();

      /* 
      Armstrong number (also known as narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
      eg. 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
      approach - sum=0,temp=n
      while(temp !=0) digit++; temp/=10;
      while(temp>0){
          int LD = temp%10;
          sum+=Math.pow(LD,3);
          temp/=10;}
          return sum==n;
      */

      int sum = 0, temp = n, digits =0;
      while(temp!= 0 ){
        digits++;
        temp /=10;
      }
      temp=n;
      while(temp > 0) {
          int LD = temp % 10; // Last digit
          sum += Math.pow(LD, digits); // Raise to the power of 3 and add to sum
          temp /= 10; // Remove last digit
      }
      if (sum == n) {
          System.out.println(n + " is an Armstrong number.");
      } else {
          System.out.println(n + " is not an Armstrong number.");
      }
  }
}
