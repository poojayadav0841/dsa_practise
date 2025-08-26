public class TermsOfAP {
    

    private static int[] termsOfAP(int x){
        int val =5;  // 3 * n +2 = 5 for n=1
        int idx =0;
        int res[]= new int[x];
        while(idx < x){
           res[idx++] = val;
           if((idx -1) % 3 == 0) val +=6;
           else val+=3;
        }

        return res;
    }
    public static void main(String[] args) {
        
        int x=4;

        /* problem statement -
         * Ayush is given a number ‘X’. He has been told that he has to find the first ‘X’ terms of the series 3 * ‘N’ + 2, 
         * which are not multiples of 4. Help Ayush to find it as he has not been able to answer.
         * Example: Given an ‘X’ = 4. The output array/list which must be passed to Ayush will be [ 5, 11, 14, 17 ].
         */
         int ans[] = termsOfAP(x);
         System.out.print("Number of AP which is not multiple of 4 : ");
         for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
         }
    }
}
