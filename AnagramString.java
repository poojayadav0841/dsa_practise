public class AnagramString {
    
    private static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c : count){
            if(c != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        
        String s = "anagram", t="nagaram";

        /* problem statement -
         * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
         */

         System.out.println("Is given two string are anagram of each other : "+isAnagram(s,t));
    }
}
