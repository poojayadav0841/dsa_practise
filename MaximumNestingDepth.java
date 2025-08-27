public class MaximumNestingDepth {
    
    private static int nestingParanthesis(String s){
        int currDepth =0, maxDepth =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                currDepth++;
                maxDepth = Math.max(currDepth, maxDepth);
            }else if(s.charAt(i)==')'){
                currDepth--;
            }
        }
        return maxDepth;
    }
    public static void main(String args[]){

        String s= "(1 + (2 * 3) + ((8)/4))+1";

        /* problem statement -
         * Given a valid parentheses string s, return the nesting depth of s.
         *  The nesting depth is the maximum number of nested parentheses.
         */

         System.out.println("Maximum nesting paranthesis : " +nestingParanthesis(s));
    }
}
