import java.util.Scanner;

public class AlphaRamp {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows to print pattern: ");
    int n=sc.nextInt();

    /* for right-angled A 
                        B B
                        C C C   here as the rows increases, no.of rows increases
                        therefore for(0 to n) <--i
                                    for(A to A+i)<--j
                                    print A+i
                                    end for
                                  end for
     */

     for(int i=0;i<n;i++){
      for(char ch='A';ch<='A'+i;ch++){
        System.out.print((char)((int)('A'+i)) + " ");

      }
      System.out.println();
     }
     sc.close();
  }
}
