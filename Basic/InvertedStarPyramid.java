import java.util.Scanner;

public class InvertedStarPyramid {
  
   public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of rows you want to print :");
    int n=sc.nextInt();

    /*
     * for reverse star pyramid pattern ***
     *                                    **
     *                                    *
     * pseudo code-
     * for(n-1to 0)<- i
     * //print space
     * for(o to n-1-i)<- print " "
     * for(j=0 to 2i+1)<-j print "*"
     * for(t to n-1-i)<-j print " "
     * print *
     * end for
     * end for
     */

     for(int i=n-1;i>=0;i--){
      //printing space
      for(int j=n-1-i;j>0;j--){
        System.out.print(" ");
      }

      //print star
      for(int j=0;j<2*i+1;j++){
        System.out.print("*");
      }

      //printing space
      for(int j=n-1-i;j>0;j--){
        System.out.print(" ");
      }
      System.out.println();
     }
  }
}
