public class PeakElement {
    
    public static void main(String args[]){

        int arr[]={1,2,3,1};

        /* problem statement -
         * we have to find peak element - element idx where element is greater then previous and after element eg 3>2 and 3>1 
         * approach - binary search O(log n)
         */

         int l=0, r = arr.length-1;

         while(l<r){
            int m = l + (r-l)/2;

            if(arr[m]<arr[m+1]){
                l = m +1;
            }else{
                r = m;
            }
         }

         System.out.println("peak element idx in the given array : "+l);
    }
}
