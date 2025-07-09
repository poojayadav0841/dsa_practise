import java.util.Scanner;

public class IncreasingLetterTri {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows to print pattern: ");
    int n=sc.nextInt();

    /* for right-angled A
                        B C
                        D E F here as the rows increases, no.of rows increases
                        therefore for(1 to n) <--i
                                    for(A to A+i)<--j
                                    print j
                                    end for
                                  end for
     */

     for(int i=1;i<=n;i++){
      for(char ch='A';ch<='A'+i;ch++){
        System.out.print(ch + " ");

      }
      System.out.println();
     }
     sc.close();
  }
}
