import java.util.Scanner;

public class RightAngledTriNumber {

  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows to print pattern: ");
    int n=sc.nextInt();

    /* for right-angled *
                        **
                        *** here as the rows increases, no.of rows increases
                        therefore for(1 to n) <--i
                                    for(1 to i)<--j
                                    print j
                                    end for
                                  end for
     */

     for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j +" ");

      }
      System.out.println();
     }
     sc.close();
  }
}

