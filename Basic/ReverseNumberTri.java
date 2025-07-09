import java.util.Scanner;

public class ReverseNumberTri {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows you want to print :");
    int n=sc.nextInt();

    /*
     * for reverse start triangle pattern 123
     *                                    12
     *                                    1
     * pseudo code-
     * for(n to 1)<- i
     * for(n=1 to i)<-j
     * print j
     * end for
     * end for
     */

     for(int i=n;i>=1;i--){
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
      }
      System.out.println();
     }
  }
}
