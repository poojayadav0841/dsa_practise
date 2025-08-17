import java.util.ArrayList;
import java.util.Arrays;

public class AllocateBooks{

     public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(n<m) return -1;
        int max = Integer.MIN_VALUE , sum =0;
        for(int i=0;i<arr.size();i++){            
            max = Math.max(arr.get(i), max);      
            sum+=arr.get(i);
        }

        int low = max, high = sum , ans =-1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(canAllocate(arr,n,m,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return ans;

    }

    private static boolean canAllocate(ArrayList<Integer> arr, int n ,int m, int maxPages){
        int studentCount =1, pageSum =0;
        for(int i=0;i<n;i++){
            if( pageSum + arr.get(i) <= maxPages){
                pageSum += arr.get(i);
            }else{
                studentCount +=1;
                pageSum =arr.get(i);

                if(studentCount >m || arr.get(i) > maxPages){
                    return false;
                }
            }

        }
        return true;
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(12, 34, 67, 90));
        int n=4, m =2;

        /* problem statement -
         * Given an integer array nums and an integer k, 
         * split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.
         * Return the minimized largest sum of the split.
         * A subarray is a contiguous part of the array.
         * Example 1:
         * Input: nums = [7,2,5,10,8], k = 2
         * Output: 18
         * Explanation: There are four ways to split nums into two subarrays.
         * The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.4
         * 
         * This code is applicable for allocate books problem statement also and also for split largest array sum
         */
        System.out.println("Mimimum number of pages allocated to two student : " +findPages(arr, n, m));
    }
}