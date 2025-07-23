public class Stock {
    
    public static void main(String[] args) {
        
        int prices[]={ 2,1,4,3,5,7};
        int buy=prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy)  buy= prices[i];
            if(prices[i]-buy>profit) profit=prices[i]-buy;
        }

        System.out.println(profit);

    }
}
