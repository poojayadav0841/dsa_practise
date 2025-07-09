import java.util.Scanner;

public class ReverseLetterTri {
  
  public static void main(String args[]){

    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of rows to print pattern: ");
    int n=sc.nextInt();

    /* for right-angled A B C
                        A B
                        A   here as the rows increases, no.of rows increases
                        therefore for(n to 1) <--i
                                    for(A to A+i)<--j
                                    print j
                                    end for
                                  end for
     */

     for(int i=n;i>=1;i--){
      for(char ch='A';ch<='A'+i;ch++){
        System.out.print(ch + " ");

      }
      System.out.println();
     }
     sc.close();
  }
}
