
import java.util.HashMap;

public class LongestSubarrSum {
    
    public static void main(String[] args) {
        
        int arr[]={10,5,2,7,1,-10};
        int k=15;

        /* problem statement - we have to print largest subarray whose sum is equal to k 
         * approach - use prefix + HashMap whose T.C is O(n) and S.C - O(n)
         * 
        */

        HashMap<Integer,Integer> map=new HashMap<>();
        int prefixSum=0;
        int maxLen=0;

        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];

            if(prefixSum==k) maxLen= i+1;

            if(map.containsKey(prefixSum-k)){
                maxLen=Math.max(maxLen, i-map.get(prefixSum-k));
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
        }

        System.out.println("Maximum subarray length : " +maxLen);
    }
}
