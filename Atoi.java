public class Atoi {
    
    private static int atoi(String s){
        //setting the maximum size for integer
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int i=0, n= s.length();

        while(i <n && s.charAt(i)==' '){
            i++; //ignore white spaces
        }

        //sign 
        int sign =1;
        while(i <n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign = -1;
            }

            i++;
        }

        //convert into digit
        long res =0;
        while( i< n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';

            //check for overflow
            if( res > (max - digit)/10){
                return sign ==1? max : min;
            }

            res = res * 10 + digit;
            i++;

        }
        return (int)(res * sign);
    }
    public static void main(String[] args) {
        
        String s ="42";

        /*problem statement -
         * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
         * eg - "42" -> 42
         */

         System.out.println("Integer of the given string : " +atoi(s));
    }
}
