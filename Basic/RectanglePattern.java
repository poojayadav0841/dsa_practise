import java.util.Scanner;

class RectanglePattern{
  public static void main(String args[]){

    /* for rectangle pattern  - ****
                                ****
                                **** 
                                each row has n number of stars 
                          therefore for(1 to n) <--i
                                       for(1 to n) <-- j
                                       print "*"
                                       end for
                                    end for
      */

      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number of rows you want to print: ");
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
          System.out.print("* ");
        }
        System.out.println();
      }
      sc.close();
  }
}