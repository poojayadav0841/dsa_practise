import java.util.Scanner;

public class DiamondPattern {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print :");
    int n=sc.nextInt();

    /*diamond pattern -    *
     *                   * * *
     *                 * * * * * 
     *                 * * * * *
     *                   * * *
     *                     *
     */

    //for upper half
    for(int i=1;i<=n;i++){
      printSpace(n-i);
      printStar(2 *i -1);
    }

    //for lower half
    for(int i=n;i>=1;i--){
      printSpace(n-i);
      printStar(2*i-1);
    }
  }

  public static void printSpace(int count){
    for(int j=0;j<count;j++){
      System.out.print(" ");
    }
  }

  public static void printStar(int count){
    for(int j=0;j<count;j++){
      System.out.print("*");
    }
    System.out.println();
  }
}
