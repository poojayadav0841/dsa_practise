import java.util.*;
public class ReverseDigit {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        /* pseudo code - 
      Brute force approach- O(log10n + 1)
       num =0
     * while(n>0)  digit = n % 10; num +=digit;num *=10; n/=10;
     * end while
     * num/=10 bcz after multiplying by 10, last digit is 0
     * if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) return 0;
     * return num
     * 
     */
        int num = 0;
        while (n > 0) {
            int digit = n % 10;
            num += digit;
            num *= 10;
            n /= 10;
        }
        num /= 10; // to remove the last extra zero added by multiplication
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            System.out.println("Reversed number is out of bounds.");
        } else {
            System.out.println("Reversed number: " + num);
        }

        sc.close();
  }
}
