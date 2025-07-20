public class MaxScoreMinSubarr {
    
    public static void main(String[] args) {
        
        int arr[]={4,3,5,1};

        int maxSum=0;
        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i]+arr[i+1];

            maxSum=Math.max(maxSum, sum);
        }
        
        System.out.println("Maximum sum in minimum subarray : " +maxSum);
    }
}
