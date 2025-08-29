public class SumOfBeautySubstr {

    private static int beautySum(String s){
        int n =s.length();
        int total =0;
        for(int i=0;i<n;i++){
            int freq[] = new int[26];
            for(int j=i;j<n;j++){
                freq[s.charAt(j)-'a']++;

                int maxFreq = 0, minFreq = Integer.MAX_VALUE;
                for(int f : freq){
                    if(f >0){
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                total += (maxFreq - minFreq);
            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        
        String  s= "aabcb";

        /* problem statement -
         * The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
         * For example, the beauty of "abaacc" is 3 - 1 = 2.
         * Given a string s, return the sum of beauty of all of its substrings.
         */

         System.out.println("Sum of Beauty of all substring : " +beautySum(s));
    }
}
