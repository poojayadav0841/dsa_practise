public class MedianInRowSortedMatrix {
    
    private static int median(int mat[][]){
        int m =mat.length, n= mat[0].length;

        int min = mat[0][0], max = mat[m-1][n-1];
        for(int i=1;i<m;i++){
          min = Math.min(min, mat[i][0]);
          max = Math.max(max , mat[i][n-1]);
        }

        int desired = (m *n +1) /2;

        while(min <= max){
            int mid = min + (max-min)/2;
            int place = 0;
            for(int i=0;i<m;i++){
             place +=countSmallerThanOrEqual(mat[i],mid);
            }

            if(place < desired){
                min =mid+1;
            }else{
                max = mid-1;
            }
        }
        return min;
    }

    private static int countSmallerThanOrEqual(int row[], int mid){
        int l=0, r= row.length-1;

        while(l<=r){
            int m= l + (r-l)/2;
            if(row[m]<=mid){
                l = m +1;
            }else{
                r = m-1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        
        int arr[][]={{1,3,5},{2,6,9},{3,6,9}};

        /*problem statement-
         * Given a row-wise sorted matrix mat[][] of size n*m,
         *  where the number of rows and columns is always odd. Return the median of the matrix.
         * Input: mat[][] = [[1, 3, 5],[2, 6, 9],[3, 6, 9]]
         * Output: 5
         * Explanation: Sorting matrix elements gives us [1, 2, 3, 3, 5, 6, 6, 9, 9]. Hence, 5 is median.
         */

        System.out.println("Median element in given row sorted matrix : "+median(arr));
    }
}
