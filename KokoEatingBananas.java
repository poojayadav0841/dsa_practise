public class KokoEatingBananas {
    

    private static int minEatingSpeed(int piles[] , int h){

        // first calculate maximum from the given piles
        int max =Integer.MIN_VALUE;
        for(int pile : piles){
            max = Math.max(max, pile);
        }

        int low =1, high =max, ans= max;

        while(low<=high){
            int mid = low + (high - low)/2;

            long totalHours = maxHours(piles,mid);

            if(totalHours <= h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;
    }

    private static long maxHours(int piles[] , int speed){
        long th =0;
        for(int i=0;i<piles.length-1;i++){
            th += (piles[i] + (long)speed -1)/speed;

            if(th > Integer.MAX_VALUE) break;
        }

        return th;
    }
    public static void main(String[] args) {
        
        int piles[] = {3,6,7,11} ;
        int h=8;

        /* problem statement-
         * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. 
         * The guards have gone and will come back in h hours.
         * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, 
         * she eats all of them instead and will not eat any more bananas during this hour.
         * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
         * Return the minimum integer k such that she can eat all the bananas within h hours.
         */

         System.out.println("Minimum eating speed : " +minEatingSpeed(piles,h));
    }
}

