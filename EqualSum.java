public class EqualSum {
    
    private static int equalSum(int token[]){
        int totalSum = 0;
        for(int i: token){
            totalSum+=i;
        }

        int leftSum =0;
        for(int i=0;i<token.length;i++){
            int rightSum = totalSum - leftSum - token[i];
            if(leftSum == rightSum ) return i;
            leftSum+=token[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int token[] = {1,4,9,3,2};

        /* problem statement -
         * After a long lockdown, Alex and Rome want to meet. There are ‘N’ checkpoints in between their homes numbered from 0 to N - 1, 
         * where checkpoint 0 is closest to Alex and checkpoint N - 1 is closest to Rome. 
         * Each checkpoint has a token with a number written on it. 
         * If someone crosses some checkpoint, he will collect the token.
         *  Alex and Rome will meet at some checkpoint ‘i’, 0 <= i <= N - 1.
         *  They aim to have the same total sum of numbers on the tokens they have collected individually when they meet at the checkpoint ‘i’.
         *  They don’t want any fights, so no one will take the token at checkpoint ‘i’.
         * You are given an array ‘token’ consisting of ‘N’ integers, signifying the number on each token. 
         * Find out the checkpoint number ‘i’ such that Alex and Rome will have the same sum of numbers on their tokens. 
         * Since Alex is lazy, find out the index closest to Alex such that the above conditions hold. 
         * Also, notify if no such checkpoints exist.
         */

         System.out.println("Idx at which token is equal : " +equalSum(token));
    }
}
