import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfCoin {
    
    private static List<Integer> minCoins(int currency[], int n){
        List<Integer> res = new ArrayList<>();
        for(int coin : currency){
            while(n>=coin){
                int count = n/coin;
                for(int i=0;i<count;i++){
                      res.add(coin);
                }

                n %= coin;
            }
        }

        return  res;
    }
    public static void main(String[] args) {

        int currency[] = {1000,500,100,50,10,5,2,1};
        int n=13;
        
        /*problem statement -
         * Given an infinite supply of Indian currency 
         * i.e. [1, 2, 5, 10, 20, 50, 100, 500, 1000] valued coins and an amount 'N'.
         *  Find the minimum coins needed to make the sum equal to 'N'. 
         * You have to return the list containing the value of coins required in decreasing order.
         */

         System.out.println("Minimum number of coins : "+ minCoins(currency,n));
    }
}
