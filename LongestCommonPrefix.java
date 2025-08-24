public class LongestCommonPrefix {
    
    private static String longestPrefix(String strs[]){

        //base case
        if(strs == null || strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        
        String strs[]={"flower", "flow", "flight"};

        /* problem statement -
         * Write a function to find the longest common prefix string amongst an array of strings.
         * If there is no common prefix, return an empty string "".
         */

         System.out.println("Longest commmon prefix in a given string array : "+longestPrefix(strs));
    }
}
