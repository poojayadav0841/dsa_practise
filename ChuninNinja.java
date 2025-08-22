
import java.util.Vector;

public class ChuninNinja {
    
    private static Vector<Integer> chuninNinja(int arr[][],int m,int n){
        Vector<Integer> res =new Vector<>();

        for(int i=0;i<m;i++){
            int minVal = Integer.MAX_VALUE;
            int colIdx =-1;

            for(int j=0;j<n;j++){
                minVal = Math.min(minVal, arr[i][j]);
            }

            for(int j=0;j<n;j++){
                boolean maxInCol =true;
                if(arr[i][j]==minVal){
                    for(int k=0;k<m;k++){
                        if(arr[k][j]>minVal){
                            maxInCol = false;
                            break;
                        }
                    }
                    if(maxInCol){
                        res.add(minVal);
                    }
                }
            }
        }
     return res;
    }
    public static void main (String[] args){
      int arr[][]={{3,4,5},{2,7,6},{1,2,4}};
      int m=arr.length, n= arr[0].length;

      /* problem statement- 
       * You are the Supreme Ninja Warrior on a visit to Ninja Class, 
       * and class can be represented as a rectangular matrix ‘ARR’ of ‘N’ rows and ‘M’ columns.
       * Each Ninja has a skill level, and each element in matrix ‘ARR’ represents the skill level of the Ninja present in the class.
       *  More formally, ‘ARR[i][j]’ represents the skill level of Ninja sitting in the ‘jth’ column of the ‘ith’ row.
       * A ninja is said to be ‘Chunin’ if he has maximum skill among all Ninjas in his column and 
       * minimum skill level among all Ninjas in his row.
       * Can you find all the ‘Chunin’ Ninjas present in the class?
       * Example :N = 3 M = 3
       * ARR = [ [3, 4, 5], [2, 7, 6] , [1, 2, 4] ]
       * Ninja at Position (0,0) has maximum skill in ‘0th’ column and minimum skill in ‘0th’ row, it is the only Chunin Ninja.
       * So, we return [ 3 ] as our ‘ANS’.
       */

       System.out.println("Chunin ninja candidate : "+chuninNinja(arr,m,n));
    }
}
