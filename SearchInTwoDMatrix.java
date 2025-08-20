public class SearchInTwoDMatrix {
    
    private static boolean search(int arr[][], int target){
        int m=arr.length, n=arr[0].length;
        int low =0, high = m*n-1;
        while(low <= high){
            int mid = low + (high - low)/2;

            int row = mid/n;
            int col = mid %n;

            int midValue = arr[row][col];
            if(midValue == target){
                return true;
            }else if(midValue < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int arr[][]={{1,3,5,7},{10,11,16,20},{20,30,34,60}};
        int target =20;

        /* problem statement-
         * You are given an m x n integer matrix matrix with the following two properties:
         * Each row is sorted in non-decreasing order.
         * The first integer of each row is greater than the last integer of the previous row.
         * Given an integer target, return true if target is in matrix or false otherwise.
         * You must write a solution in O(log(m * n)) time complexity.
         */

         System.out.println("Is target present in the given array : "+ search(arr,target));
         
    }
}
