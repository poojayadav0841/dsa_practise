

import java.util.Scanner;

class IntegerPalindrome{

    public static void main(String args[]){


        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number to check palindrome : ");
            int n = sc.nextInt();
            System.out.println(n + " is palindrome? : " + isPalindrome(n));
        } catch (Exception e) {
            System.out.println(e);
        }
        
               

        /*
         * logic temp=n
         * while(temp>0) LD = temp%10;
         * rev = rev*10 +LD
         * temp/=10
         * end while
         * return rev==n?"true" : "false"
         */

        
    }

    public static boolean isPalindrome(int n){
        if(n<0) return false;
        int temp=n, rev=0;
        while(temp>0){
            int lastDigit= temp%10;
            rev = rev *10 + lastDigit;
            temp/=10;
        }

        return rev==n;
    }
}