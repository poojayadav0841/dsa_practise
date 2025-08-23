public class ReverseWord {
    
    private static String reverseWord(String str){
       
        str = str.trim(); //remove extra spaces

        String words[] = str.split("\\s+"); //split the words by , and add it is in array

        StringBuilder res = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);

            if(i>0) res.append(" ");
        }

        return res.toString();
    }
    public static void main(String[] args) {
        
        String str = "the sky is blue";

        /* problem statement -
         * Given an input string s, reverse the order of the words.
         * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
         * Return a string of the words in reverse order concatenated by a single space.
         * Note that s may contain leading or trailing spaces or multiple spaces between two words.
         *  The returned string should only have a single space separating the words. Do not include any extra spaces.
         */

         System.out.println("Reverse of the given word : " +reverseWord(str));
    }
}
