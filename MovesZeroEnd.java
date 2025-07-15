public class MovesZeroEnd {
    
    public static void main(String[] args) {
        int arr[]={0,1,0,3,5};
        int n=arr.length;

        /* statement is to move all the 0 to the end of array
         * Approach- two pointer approach
         * use pointer j to keep track of non-zero element
         * if pointer arr[i]!= 0 then put it in arr[j] and increment j
         * now move the remaining 0 element to the end of array
         * 
         */

         int j=0;
         for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
         }

         while(j<n){
            arr[j]=0;
            j++;
         }

         for(int i:arr){
            System.out.print(i+" ");
         }
    }
}
