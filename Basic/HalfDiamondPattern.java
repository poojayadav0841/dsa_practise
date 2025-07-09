import java.util.Scanner;

public class HalfDiamondPattern {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print :");
    int n=sc.nextInt();

    /*diamond pattern -    *
     *                     * *
     *                     * * * 
     *                     * *
     *                     *
     *                     
     */

    //for upper half
    for(int i=1;i<=n;i++){
      // printSpace(n-i);
      printStar(i);
    }

    //for lower half
    for(int i=n-1;i>=1;i--){
      // printSpace(n-i);
      printStar(i);
    }

    sc.close();
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
