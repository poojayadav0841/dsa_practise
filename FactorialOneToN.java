import java.util.ArrayList;

public class FactorialOneToN {

  static ArrayList<Integer> list = new ArrayList<>();
  public static ArrayList<Integer> factorialNumber(int n){

    GenerateFactorial(1,1 , n);
    return list;
  }
  public static void main(String[] args) {
    int n=5;

    /*
     * pseudo code : Helper(fact,i,n){
     * if(fact>n) return;
     * list.add(fact);
     * Helper(fact*(i+1),i+1,n);
     * }
     */

     factorialNumber(n);
     System.out.println("Factorial numbers from 1 to " + n + " are: "+list);
  }

  public static void GenerateFactorial(int fact, int i,int n){
    if(fact>n) return;
    list.add(fact);
    GenerateFactorial(fact*(i+1), i+1, n);
  }
  
}
