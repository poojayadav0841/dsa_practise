

public class PeakElementII {
    
    private static int[] findPeakGrid(int mat[][]){
        int m=mat.length, n =mat[0].length;

        int left =0, right =n-1;
        while(left <= right){
            int mid = left + (right - left)/2;

            int maxRow =0;
            for(int i=0;i<m;i++){
                if(mat[i][mid]> mat[maxRow][mid]){
                    maxRow = i;
                }
            }

            int leftVal = (mid>0) ? mat[maxRow][mid-1] : -1;
            int rightVal = (mid < n-1) ? mat[maxRow][mid+1] : -1;

            if(mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal){
                return new int[]{maxRow,mid};
            }else if(mat[maxRow][mid]< leftVal){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        
        int mat[][]={{1,4},{3,2}};
        
        /* problem statement -
         * A peak element in a 2D grid is an element that is strictly greater than 
         * all of its adjacent neighbors to the left, right, top, and bottom.
         * Given a 0-indexed m x n matrix mat where no two adjacent cells are equal,
         *  find any peak element mat[i][j] and return the length 2 array [i,j].
         * You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.
         * You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.
         */

         int res[] = findPeakGrid(mat);
         System.out.println("Idx which satisfies the above condition : " +res[0] + " " + res[1]);
         

         
    }
}
