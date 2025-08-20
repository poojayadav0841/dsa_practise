public class RowWithMax1 {
    
    private static int rowWithMax1(int arr[][]){
        int m=arr.length, n =arr[0].length;

        int max_idx=-1;
        int row =0, col= n-1;
        while(row < m && col >=0){
            if(arr[row][col]==1){
                max_idx = row;
                col--;
            }else{
                row++;
            }
        }
        return max_idx;

    }

    public static void main(String[] args) {
        
        int arr[][] = {{0,1,1,1}, {0,0,1,1}, {1,1,1,1}, {0,0,0,0}};

        /* problem statement-
         * You are given a 2D binary array arr[][] consisting of only 1s and 0s. 
         * Each row of the array is sorted in non-decreasing order. 
         * Your task is to find and return the index of the first row that contains the maximum number of 1s.
         *  If no such row exists, return -1.
         */

         System.out.println("Row idx having maximum 1's : " +rowWithMax1(arr));
    }
}
