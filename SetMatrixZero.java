public class SetMatrixZero {
    
    public static void main(String[] args) {
        
        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        int row=arr.length;
        int col=arr[0].length;
        boolean firstRowZero=false, firstColZero = false;

        //check if first row is zero
        for(int j=0;j<col;j++){
            if(arr[0][j]==0){
                firstRowZero=true;
                break;
            }
        }

        //check if first col is zero
        for(int i=0;i<row;i++){
            if(arr[i][0]==0){
                firstColZero=true;
                break;
            }
        }

        //set the marker of zero
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        //set zeros based on marker
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(arr[0][j]==0 || arr[i][0]==0){
                    arr[i][j]=0;
                }
            }
        }

        if(firstRowZero){
            for(int j=0;j<col;j++){
                arr[0][j]=0;
            }
        }

        if(firstColZero){
            for(int i=0;i<row;i++){
                arr[i][0]=0;
            }
        }

        for(int i[] : arr){
            for(int j: i){
              System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
