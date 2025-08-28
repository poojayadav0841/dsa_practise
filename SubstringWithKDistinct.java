
import java.util.HashMap;
import java.util.Map;

public class SubstringWithKDistinct {

    private static int substring(String s, int k){
        if (k==0) return 0;
        return atMost(s,k) - atMost(s, k-1);
    }

    private static int atMost(String s, int k){
        int n=s.length(), left =0, count =0;

        Map<Character , Integer> freq = new HashMap<>();

        for(int right =0; right<n;right++){
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c,0)+1);

            while(freq.size() > k){
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar)-1);
                if(freq.get(leftChar) ==0){
                    freq.remove(leftChar);
                }
                left++;
            }
            count += (right - left + 1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        
        String s = "abc" ;
        int k =2;
 
        /* problem statement -
         * You are given a string s consisting of lowercase characters and an integer k,
         *  You have to count all possible substrings that have exactly k distinct characters.
         * Examples :Input: s = "abc", k = 2
         * Output: 2 
         * Explanation: Possible substrings are ["ab", "bc"]
         */

         System.out.println("Number of substring with k distinct : " + substring(s,k));
    }
}
