public class RotateMatrixByNinety {
    
    public static void main(String[] args) {
        
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};

        int m=mat.length, n= mat[0].length;

        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int i=0;i<m;i++){
           reverseRow(mat[i]);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static void reverseRow(int row[]){
        int start=0,end=row.length-1;
        while(start<end){
            int temp=row[start];
            row[start]=row[end];
            row[end]=temp;
            start++;
            end--;
        }
    }
}
