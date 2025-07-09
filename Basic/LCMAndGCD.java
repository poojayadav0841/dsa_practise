import java.util.Scanner;

public class LCMAndGCD {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter tw0 number to find LCM and GCD : ");
            int a = sc.nextInt();
            int b=sc.nextInt();
            System.out.println("LCM = " + LCM(a,b)+ "and GCD = " + GCD(a,b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int GCD(int a,int b){
        while(b != 0 ){
            int temp=b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static int LCM(int a, int b){
        return (a *b)/GCD(a,b);
    }
}
