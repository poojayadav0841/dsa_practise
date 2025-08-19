public class KthElementOfTwoArr {

     private static int kthElement(int a[], int b[], int k) {
        // code here
        if(a.length>b.length){
            return kthElement(b,a,k);
        }
        
        int m=a.length, n= b.length;
        
        int left = Math.max(0,k-n), right = Math.min(k,m);
        while(left <= right){
            int i = (left +right)/2;
            int j= k-i;
            
            int aLeft = (i==0)? Integer.MIN_VALUE : a[i-1];
            int aRight = (i==m) ? Integer.MAX_VALUE : a[i];
            
            int bLeft = (j==0) ? Integer.MIN_VALUE : b[j-1];
            int bRight = (j==n) ? Integer.MAX_VALUE : b[j];
            
            if(aLeft<= bRight && bLeft <= aRight){
                return Math.max(aLeft,bLeft);
            }else if(aLeft > bRight){
                right =i-1;
            }else{
                left = i+1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int a[]={2, 3, 6, 7, 9} , b[]={1, 4, 8, 10};
        int k=5;

        /* problem statement -
         * Given two sorted arrays a[] and b[] and an element k, 
         * the task is to find the element that would be at the kth position of the combined sorted array.
         */

         System.out.println("Element at " +k+ "position : " +kthElement(a,b,k));
    }

}
