public class MinDays {
    
    private  static int minDays(int bloomDay[], int m,int k){

        int n=bloomDay.length;

        //check if no. of flowers are present in given array or not
        if((long) m*k >n) return -1;

        int low= Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int bloom : bloomDay){
            low = Math.min(low,bloom);
            high = Math.max(high, bloom);
        }

        int res =-1;
        while(low <= high){
            int mid = low +(high - low) /2;

            if(canMake(bloomDay,m,k,mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }

    private static boolean  canMake(int bloomDay[], int m, int k, int day){
        int bonquet=0, flowers =0;
        for(int bloom : bloomDay){
            if(bloom <= day){
                flowers++;
                if(flowers <=k){
                    bonquet++;
                    flowers =0;
                }
            }else{
                flowers = 0;
            }
        }

        return bonquet >=m;
    }
    public static void main(String[] args) {
        
        int bloomDay[] = {1,10,3,10,2};
        int m=3, k=1;

        /* problem statement -
         * You are given an integer array bloomDay, an integer m and an integer k.
         * You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
         * The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and 
         * then can be used in exactly one bouquet.
         * Return the minimum number of days you need to wait to be able to make m bouquets from the garden. 
         * If it is impossible to make m bouquets return -1.
         */

         System.out.println("Minimum number of days required to make bonquet : "+minDays(bloomDay,m,k));
    }
}

