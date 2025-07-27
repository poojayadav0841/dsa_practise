import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String args[]){
        int numRows=5;

        /*
         * pascal triangle -  1
         *                   1 1
         *                  1 2 1
         *                 1 3 3 1
         */

         List<List<Integer>> res =new ArrayList<>();

         for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    int val=res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    row.add(val);
                }
            }

            res.add(row);
         }

         for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
         }
    }
    
}
