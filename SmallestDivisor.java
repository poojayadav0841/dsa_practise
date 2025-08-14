public class SmallestDivisor {
    
    private static int smallestDivisor(int nums[], int threshold){
        int max = Integer.MIN_VALUE;
        for(int num :nums){
            max = Math.max(max, num);
        }

        int low = 1, high=max , ans = max;
        while(low <= high){
            int mid = low + (high - low)/2;

            long sum =0;
            for(int num: nums){
                sum += (num + mid - 1)/mid; // ceil value
                if(sum > threshold) break;
            }

            if(sum <= threshold){
                ans = mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static void main(String args[]){

        int nums[]= {1,2,5,9};
        int threshold = 6;

        /* problem statement - Binary search on answers
         * Given an array of integers nums and an integer threshold, we will choose a positive integer divisor,
         *  divide all the array by it, and sum the division's result. 
         * Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
         * Each result of the division is rounded to the nearest integer greater than or equal to that element.
         *  (For example: 7/3 = 3 and 10/2 = 5).
         * The test cases are generated so that there will be an answer.
         */

         System.out.println("Smallest possible Divisor within the given threshold : "+smallestDivisor(nums, threshold));


    }
}
