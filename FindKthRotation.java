public class FindKthRotation {
    
    private static int KthRotation(int arr[]){
        int l=0, r=arr.length-1;
        while(l<r){
            int m= l + (r-l)/2;
            if(arr[m]<=arr[r]) r=m;
            else l=m+1;
        }
        return l;
    }
    public static void main(String[] args) {
        
        int arr[]={5,6,7,0,1,2,3,4};

        /* problem statement - 
         * we have to find maximum rotation in the above array in log(n) times
         */

         System.out.println("No. of rotation in given arr : "+ KthRotation(arr));
    }
}
