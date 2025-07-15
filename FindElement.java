public class FindElement {
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5,6};
        int k=4;

        /* statement is to find the element in sorted array - 
         * Approach - Binary search - O(log n)
         */
        int start=0;
        int end=arr.length-1;
        boolean found=false;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k) {
                System.out.println("Element is present in the array");
                found = true;
                break;
            }
            else if(arr[mid]>k) end=mid-1;
            else start=mid+1;
        }

        if(!found) System.out.println("Element is not present in the given array");

    }
}
