import java.util.*;

public class AggressiveCows {
    
    // Function to check if cows can be placed with at least 'dist' distance
    public static boolean canPlaceCows(int[] stalls, int cows, int dist) {
        int count = 1;  // place first cow at stalls[0]
        int lastPos = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
                if (count >= cows) return true;  // all cows placed
            }
        }
        return false;
    }

    public static int largestMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls); // sort stalls
        int low = 1, high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canPlaceCows(stalls, cows, mid)) {
                result = mid;   // mid is possible, try for bigger
                low = mid + 1;
            } else {
                high = mid - 1; // mid not possible, reduce distance
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        
        int stalls[]={1,2,8,4,9};
        int c=3;

        System.out.println("Minimum Distance between cows : "+largestMinDistance(stalls, c));
        
        
       
    }
}
