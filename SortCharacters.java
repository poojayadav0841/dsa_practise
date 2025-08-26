import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacters {
    
    private static String sortFrequencyCount(String s){

        Map<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a,b) -> freq.get(b) - freq.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            int count = freq.get(c);
            for(int i=0;i<count;i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String s= "tree";

        /* problem statment -
         * Given a string s, sort it in decreasing order based on the frequency of the characters. 
         * The frequency of a character is the number of times it appears in the string.
         * Return the sorted string. If there are multiple answers, return any of them.
         * Example 1:Input: s = "tree"
         * Output: "eert"
         */
         System.out.println("Maximum frequency count order of the string : "+sortFrequencyCount(s));
    }
}
