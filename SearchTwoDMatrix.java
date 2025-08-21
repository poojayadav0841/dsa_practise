public class SearchTwoDMatrix {
    
    private static  boolean search(int mat[][], int target){
        int row=0, col= mat[0].length-1;

        while(row<mat.length && col>=0){
            if(mat[row][col]==target){
                return true;
            }else if (mat[row][col]> target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        
        int mat[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        /*problem statement -
         * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. 
         * This matrix has the following properties:
         * Integers in each row are sorted in ascending from left to right.
         * Integers in each column are sorted in ascending from top to bottom.
         */

         System.out.println("Is given target present in the given arr : "+search(mat,target));
    }
}
