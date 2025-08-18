public class MinimizeMaxDistanceToGasStation {
    
    public static double findSmallestMaxDist(int stations[], int k) {
        // code here
        int n= stations.length;
        double low =0, high = stations[n-1]-stations[0];
        
        while(high - low > 1e-6){
            double mid = (low + high) / 2.0;
            
            if(canPlace(stations,k,mid)){
                high = mid;
            }else{
                low =mid;
            }
        }
        return Math.round( high* 100.0)/100.0;
        
    }
    private static boolean canPlace(int stations[], int k, double dist){
        int needed =0;
        for(int i=1;i<stations.length;i++){
            double gap = stations[i]-stations[i-1];
            if(gap>dist){
                needed += (int)Math.ceil(gap/dist)-1;
            }
        }
        return needed <=k;
    }

    public static void main(String[] args) {
        
        int stations[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=9;

        /*problem statements -
         * We have a horizontal number line. On that number line,
         *  we have gas stations at positions stations[0], stations[1], ..., stations[n-1],
         *  where n is the size of the stations array. Now, we add k more gas stations so that d,
         *  the maximum distance between adjacent gas stations, is minimized.
         *  We have to find the smallest possible value of d. Find the answer exactly to 2 decimal places.
         * Note: stations is in a strictly increasing order.
         * Example 1:
         * Input:n = 10
         * stations[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] ,k = 9
         * Output: 0.50
         * Explanation: Each of the 9 stations can be added mid way between all the existing adjacent stations.
         */

        System.out.println("mimum number of gas stations between gap : " +findSmallestMaxDist(stations, k));
    }
}
