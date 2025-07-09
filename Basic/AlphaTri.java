import java.util.*;

public class AlphaTri {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int  n = sc.nextInt();
    
    /*Alpha Hill pattern -  C
     *                      B C
     *                      A B C
     *                       
     *
     * pseude code - for(0 to n)
     *               for('A'+n-1-i to 'A'+n-1) print space //for spaces
     *               print ch
     *              
     *      */

     for(int i=0;i<n;i++){
      
      for(char ch=(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
        System.out.print(ch + " ");
      }
      System.out.println();
     }

     sc.close();
  }
}
