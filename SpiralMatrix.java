import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    
    public static void main(String[] args) {
        
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};

        List<Integer> res= new ArrayList<>();

        int top=0,bottom=mat.length-1,left = 0, right=mat[0].length-1;

        while(top <= bottom && left<= right){
            //left to right
            for(int i=left;i<=right;i++){
                res.add(mat[top][i]);
            }
            top++;

            //top to bottom
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
            }
            right--;

            //right to left
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                res.add(mat[bottom][i]);
            }
            bottom--;
        }
            //bottom to top
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                res.add(mat[i][left]);
            }
            left++;
        }
        }

        

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i) +" ");
        }


    }
}
