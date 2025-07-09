import java.util.Scanner;

public class BinaryNumberTri {

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the no. of row you want to print : ");
      int n=sc.nextInt();

      /* pattern - 1  //i =0
       *           0 1  //i=1
       *           1 0 1 // i=2
       *           0 1 0 1 // i=3 as even rows start with 1
       */

       int start=1;
       for(int i=0;i<n;i++){
          
          if(i %2 ==0) {
            start=1;
          }else{
            start = 0 ;
          }

          for(int j=0;j<=i;j++){
            System.out.print(start + " ");
            start = 1 - start;
          }
          System.out.println();

       }

       sc.close();
  }
  
}
