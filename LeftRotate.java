public class LeftRotate {
    
    private static void reverse(int arr[],int start,int end){
         
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        } 
    }
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;
        //to check if k > n
        k=k%n;
        /*rotate the array by value of k so output is {5,6,7,1,2,3,4} 
         * Approach-first reverse the array- reverse(arr,0,n-1) - O(n)
         * reverse the k array - revese (arr,0,k-1); - O(k)
         * reverse the remaining array- reverse(arr,k,n-1); - O(n-k) 
         * total - O(n)
        */

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
