public class CountSubarr0And1 {
    
    public static void main(String[] args) {
        
        int arr[]={1,0,0,0,1,1,0,1};

        /*
         * for counting the total number of consecutive 0 and 1 subarr- k*(k+1)/2;
         */
        int count=1, total=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]) count++;
            else{
            total+=count*(count+1)/2;
            count =1;
        }
        }

        total += count * (count + 1)/2;
        System.out.println("Total number of zero and one subarray :" +total);
    }
}
