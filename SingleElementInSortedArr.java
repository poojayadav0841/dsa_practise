public class SingleElementInSortedArr {
    
    private static int singleElement(int arr[]){
        int l=0,r= arr.length-1;
        while(l<r){
            int m= l + (r-l)/2;

            //skip even
            if(m %2 ==1) m--;

            if(arr[m] == arr[m+1]) l=m+2; //skip for duplicates
            else r=m;
        }

        return arr[l];
    }
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,3,3,4,4,5,5,6,6};

        /* problem statement -
         * we have to find single element in given sorted arr in log n times
         */
        System.out.println("single element in sorted arr : "+singleElement(arr));
    }
}
