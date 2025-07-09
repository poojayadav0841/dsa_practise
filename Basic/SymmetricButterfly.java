import java.util.Scanner;

public class SymmetricButterfly {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int n = sc.nextInt();

    /* Symmetric Butterfly pattern - 
                                 *        *
                                 **      **
                                 ***    ***
                                 ****  ****
                                 **********
                                 **********
                                 ****  ****
                                 ***    ***
                                 **      **
                                 *        *
     pseudo code : 
     space = 2n-2
     for( 1 to 2n)- stars = i, if(i>n) stars = 2*n-i
     for(j=1 to stars) - print stars
     for(j=1 to space)- print space
     for(j=1 to stars) - print stars
     System.out.println();
     if(i<n) space -= 2
     else space+=2

                                 */

    int space = 2 *n -2;
    for(int i=1;i<=2*n-1;i++){
      int stars = i;
      if(i>n) stars = 2*n-i;
      //print stars
      for(int j=1;j<=stars;j++){
        System.out.print("*");
      }

      //print space
      for(int j=1;j<=space;j++){
        System.out.print(" ");
      }

      //print stars
      for(int j=1;j<=stars;j++){
        System.out.print("*");
      }

      System.out.println();
      if(i<n) space -=2;
      else space +=2;
    }
    sc.close();

  }
}
