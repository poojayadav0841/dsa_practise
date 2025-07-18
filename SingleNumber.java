public class SingleNumber {
    
    public static void main(String[] args) {
        
        int arr[]={4,1,2,1,2};

        /*problem statement - we have to print the number which is not repeated in the arr
         * approach using - XOR which will return 0 for 1 ^ 1
         */

         int idx=0;
         for(int i=0;i<arr.length;i++){
            idx= idx ^ arr[i];
         }

         System.out.println("Single element is "+idx);
    }
}
