import java.util.Scanner;

public class NumberPattern {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    /* Symmetric Number pattern - 
                                 33333
                                 32223
                                 32123
                                 32223
                                 33333
     pseudo code : 
     for(0 to 2n-1)
     for(0 to 2n-1) top =i, bottom = j, left = 2n=i, right=2n-j
     print(n-min(min(top,bottom),min(left,right)))+" ")
     end for
     nextline
     end for
                                 */

    for(int i=0;i<2*n-1;i++){
      for(int j=0;j<2*n-1;j++){
        int top=i;
        int bottom = j;
        int left = (2*n-2)-i;
        int right = (2*n-2)-j;
        System.out.print(n-Math.min(Math.min(left,right),Math.min(top,bottom)) + " ");
        
      }
      System.out.println();
    }
    sc.close();

  }
}
