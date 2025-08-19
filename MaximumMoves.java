import java.util.*;

public class MaximumMoves {
    

    private static int rounds(int a, int b){

        List<Integer> primes = sieve(a);
        int totalMoves = 0;
        for(int p : primes){
            int expA = exponentInFactorial(a,p);
            int expB= exponentInFactorial(b,p);

            totalMoves += expA - expB;
        }
        return totalMoves;
    }

    private static int exponentInFactorial(int n,int p){
        int count =0;
        int power =p;
        while(power <=n){
            count+= n/power;
            power *=p;
        }
        return count;
    }

    private static List<Integer> sieve(int n){
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if(n>=1) isPrime[1]=false;

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j]=false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i=2;i<=n;i++){
            if(isPrime[i]){
                primes.add(i);
            }
        }
        return primes;
    }
    public static void main(String args[]){

        int a=3,b=1;

        /*problem statement -
        *Given an integer ‘N’, you need to make the maximum possible number of moves 
        where each move consists of choosing a positive integer ‘X’ > 1, such that ‘N’ is divisible by ‘X’ 
        and replacing ‘N’ with ‘N/X’.
        When ‘N’ becomes equal to 1 and there are no more possible valid moves. 
        You need to stop and your score is equal to the number of moves made.
        Given ‘N’ is of the form a! / b! ( i.e. factorial of ‘a’ divided by factorial of ‘b’)
         for some positive integer ‘a’ and ‘b’ (a ≥ b).
         You need to find and return the maximum possible score you can achieve.
         */

         System.out.println("Maximum number of moves : "+rounds(a,b));
    }
}
