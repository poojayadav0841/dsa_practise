public class MinimumCapacityShip {
    
    private static int minWeights(int weights[], int days){
        //first calculate the max and sum of array as weight lies within this range

        int max = Integer.MIN_VALUE, sum=0;
        for(int w : weights){
            max = Math.max(max,w);
            sum +=w;
        }

        int low = max, high =sum, ans = sum;
        while(low <= high){
            int mid = low + (high - low)/2;

            int day =1, load =0;
            for(int w : weights){
                if(load + w > mid){
                    day++;
                    load = w;
                }else{
                    load+=w;
                }
            }

            int daysReq = day;

            if(daysReq <= days){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        /*problem statement - Binary search on answers
         * A conveyor belt has packages that must be shipped from one port to another within days days.
         * The ith package on the conveyor belt has a weight of weights[i]. Each day, 
         * we load the ship with packages on the conveyor belt (in the order given by weights). 
         * We may not load more weight than the maximum weight capacity of the ship.
         * Return the least weight capacity of the ship that will result in all the packages 
         * on the conveyor belt being shipped within days days.
         * Example 1:
         * Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
         * Output: 15
         * Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
         * 1st day: 1, 2, 3, 4, 5
         * 2nd day: 6, 7
         * 3rd day: 8
         * 4th day: 9
         * 5th day: 10
         */

        System.out.println("Minimum number of days required to ship all the packages : "+minWeights(weights, days));
    }
}
