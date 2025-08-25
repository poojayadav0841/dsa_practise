public class RotateString {
    
    private static boolean  rotateString(String s, String goal){
        if(s.length() != goal.length()) return false;
        return (s+s).contains(goal);
    }
    public static void main(String[] args) {
        
        String s="abcde" , goal = "cdeab";

        /* problem description-
         * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
         * A shift on s consists of moving the leftmost character of s to the rightmost position.
         * For example, if s = "abcde", then it will be "bcdea" after one shift.
         */

         System.out.println("Is the goal string rotation of the given string : " +rotateString(s, goal));
    }
}
