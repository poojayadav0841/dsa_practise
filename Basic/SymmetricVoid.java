import java.util.*;

public class SymmetricVoid {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();
    
    /* Symmetric Void pattern - **********
                                ****  ****
                                ***    ***
                                **      **
                                *        *
                                *        *
                                **      **
                                ***    ***
                                ****  ****
                                **********
     * */

     int inIs=0;
     for(int i=0;i<n;i++){

      //print stars
      for(int j=0;j<n-i;j++){
        System.out.print("*");
      }

      for(int j=0;j<inIs;j++){
        System.out.print(" ");
      }

      //print starts
      for(int j=0;j<n-i;j++){
        System.out.print("*");
      }

      inIs+=2;
      System.out.println();
     }

     //lower half
     inIs = 2*n-2;
     for(int i=1;i<=n;i++){
      //print stars
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }

      //print spaces
      for(int j=0;j<inIs;j++){
        System.out.print(" ");
      }

      //print stars
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }

      inIs-=2;
      System.out.println();
     }
     
  }
}
