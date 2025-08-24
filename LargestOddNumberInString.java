public class LargestOddNumberInString {
    

    private static String largestOdd(String nums){

        for(int i=nums.length()-1;i>=0;i--){
            int digit = nums.charAt(i)-'0';
            if(digit %2 ==1){
                return nums.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        
        String nums="31245";

        /* problem statement -
         * You are given a string num, representing a large integer. 
         * Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string ""
         *  if no odd integer exists.
         * A substring is a contiguous sequence of characters within a string.
         */

         System.out.println("Largest substring in a given string : " + largestOdd(nums));
    }
}
