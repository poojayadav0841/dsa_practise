public class MissingKthPositionElement {
     public static  int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            int missing = arr[i] - (i + 1);
            if (missing >= k) {
                return arr[i] - (missing - k + 1);
            }
        }
        
        // if not found in loop, it's after last element
        return arr[n-1] + (k - (arr[n-1] - n));
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4};
        int k =2;

        /* problem statement - 
         * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
         * Return the kth positive integer that is missing from this array.
         * Example 1:
         * Input: arr = [2,3,4,7,11], k = 5
         * Output: 9
         * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
         */

        System.out.println("Missing element of the given kth position : " +findKthPositive(arr,k));
    }
    
}
