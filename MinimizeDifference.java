
import java.util.*;

public class MinimizeDifference {
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        int k=2;

    /*problems statement- we have to add or subtract the value of k in each element and at last the result
     * should be the minimum difference between max and min element
     * 
     */

     Arrays.sort(arr);
     int n=arr.length;

     int ans=arr[n-1]-arr[0];

     int smallest = arr[0]+k;
     int largest= arr[n-1]-k;

     for(int i=0;i<n-1;i++){
        int minElement=Math.min(smallest,arr[i+1]-k);
        int maxElement= Math.max(largest,arr[i]+k);

        if(minElement<0) continue;

        ans=Math.min(ans, maxElement-minElement);
     }

     System.out.println("minimum difference : " + ans);
    }


}
