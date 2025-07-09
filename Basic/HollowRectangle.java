import java.util.Scanner;

public class HollowRectangle {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    /* Symmetric Hollow Rectangle pattern - 
                                 ****
                                 *  *
                                 *  *
                                 ****
     pseudo code : 
     for(0 to n)
     for(0 to n) if(i==0 || i==n-1 || j==0 || j==n-1) print "*"
      else print " "
                                 */

    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        if(i==0 || j==0 || i==n-1 || j==n-1){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
    sc.close();

  }
}
