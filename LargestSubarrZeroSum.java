import java.util.HashMap;

public class LargestSubarrZeroSum {
    
    private static int maxLength(int arr[]) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int n=arr.length;
        int prefixSum=0, maxLen =0;
        for(int i=0;i<n;i++){
            prefixSum +=arr[i];
            
            if(prefixSum==0){
                maxLen = i+1;
          }
          if(map.containsKey(prefixSum)){
              int prevIdx = map.get(prefixSum);
              maxLen = Math.max(maxLen,i-prevIdx);
          }else{
              map.put(prefixSum , i);
          }
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        /* print the largest subarray size whose sum is zero */

        System.out.println(maxLength(arr));
    }
}
