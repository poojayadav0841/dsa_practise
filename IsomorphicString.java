public class IsomorphicString {
    
    private static boolean isomorphicString(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        int mapST[] = new int[256];
        int mapTS[] = new int[256];

        for(int i=0;i<256;i++){
            mapST[i]=-1;
            mapTS[i]=-1;
        }

        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);

            if(mapST[c1] ==-1 && mapTS[c2]==-1){
                mapST[c1]= c2;
                mapTS[c2]=c1;
            }else{
                if(mapST[c1] != c2 || mapTS[c2] != c1){
                    return false;
                }
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        
        String s="egg", t="bar";

        /*problem description -
         * Given two strings s and t, determine if they are isomorphic.
         * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
         * All occurrences of a character must be replaced with another character while preserving the order of characters.
         *  No two characters may map to the same character, but a character may map to itself.
         * Example 1:
         * Input: s = "egg", t = "add"
         * Output: true
         */

         System.out.println("Is given two strings are isomorphic : " +isomorphicString(s,t));
    }
}
