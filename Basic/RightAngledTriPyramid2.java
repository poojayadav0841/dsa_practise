import java.util.Scanner;

public class RightAngledTriPyramid2 {
 
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows to print pattern: ");
    int n = sc.nextInt();

    /* For right-angled triangle pyramid
       The number of rows increases, and for each row, the number of stars increases
       Therefore, for (1 to n) <-- i
       For (1 to i) <-- j
       Print i stars
       End for
       End for

    output will be: 1
                    2 2
                    3 3 3
                    4 4 4 4
                    
    */
     for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i + " ");
      }
      System.out.println();
     }
     sc.close();
  }  
  
}