public class MaxRectSum {
    
    public static void main(String args[]){

        int arr[][]={{-1,1},{2,2}};
        int n=2 , m= 2;
        int maxSum = Integer.MIN_VALUE;

        for(int left= 0;left<=m-1;left++){
           int temp[] = new int[n];
           for(int right= left;right<=m-1;right++){
            for(int i=0;i<n;i++){
                temp[i]+=arr[i][right];
            }

            int currSum = kadane(temp);
            maxSum = Math.max(currSum , maxSum);
           }
        }

        System.out.println("Maximum Rectangle Sum : "+ maxSum);
    }

    private static int kadane(int arr[]){
        int maxSoFar = arr[0], currMax = arr[0];
        for(int i=1;i<arr.length;i++){
            currMax = Math.max(arr[i],currMax+arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
