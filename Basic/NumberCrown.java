import java.util.Scanner;

public class NumberCrown {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows you want to print :");
    int n=sc.nextInt();

    /*crwon number    -    1          1
     *                     1 2      2 1
     *                     1 2 3  3 2 1
     *                     
     *                     
     */

     for(int i=1;i<=n;i++){
      //left side
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }

      //space part
      int space = 2*(n-i);
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }
      //right side
      for(int j=i;j>=1;j--){
        System.out.print(j);
      }
      System.out.println();
     }
    

    sc.close();
  }

  
}
 
