import java.util.Scanner;

public class IncreasingNumTri {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows to print pattern: ");
    int n=sc.nextInt();

    /* for right-angled 1
                        2 3
                        4 5 6 here as the rows increases, no.of rows increases
                        therefore   num=1
                                    for(1 to n) <--i
                                    for(1 to i)<--j
                                    print num
                                    num+1
                                    end for
                                    end for
     */

     int num=1;
     for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(num+" ");;
        num++;

      }
      System.out.println();
     }
     sc.close();
  }
}
