
import java.util.*;

public class CountDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        /* pseudo code - 
      Brute force approach- O(log10n + 1)
       count =0
     * while(n>0)  count ++; temp/=10;
     * end while
     * return count
     * 
     * //optimise approach - O(1)
     * count = (int)Math.log10(n)+1;
     * return count
         */

        int count = 0, temp = n;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Number of digits: " + count);

        //optimised approach
        System.out.println("Number of digits (Optimised): " + ((int) (Math.log10(n) + 1)));

        /*problem statement-Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

        A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
        Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined. */

        System.out.println("Count of digits that divide n evenly: " + countDivisibleDigits(n));
        sc.close();
    }

    public static int countDivisibleDigits(int n){
      int count =0;
      for(int temp=n;temp>0;temp/=10){
        int digit=temp%10;
        if(digit != 10 && n % digit ==0){
          count++;
        }
      }
      return count;
    }
}

