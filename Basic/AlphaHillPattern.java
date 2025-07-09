import java.util.*;

public class AlphaHillPattern {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int  n = sc.nextInt();
    
    /*Alpha Hill pattern -    A
     *                      A B A
     *                     A B C B A
     *                       
     *
     * pseude code - for(0 to n)
     *               for(0 to n-i-1) print space //for spaces
     *               ch='A', breakpoint = (2 *i+1)/2
     *               for(1 to 2*i+1) print character
     *               if(j<breakpoint) ch++ else ch--
     */

     for(int i=0;i<n;i++){
      //print spaces
      for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
      }

      char ch='A';
      int breakpoint = (2*i+1)/2; //from where to switch from incrementing to decrementing character

      //printing characters
      for(int j=1;j<2*i+1;j++){
        System.out.print(ch+" ");
        if(j<= breakpoint) ch++;
        else ch--;
      }

      //printing spaces
      for(int j=0;j<n-i-1;j++){
        System.out.print(" ");
      }
      System.out.println();
     }

     sc.close();
  }
}
