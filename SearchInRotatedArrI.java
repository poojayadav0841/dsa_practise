public class SearchInRotatedArrI {
    
    private static  int search(int arr[], int target){
        int left =0, right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(arr[left]<=arr[mid]){
                if(arr[left]<= target && target < arr[mid]){ // search in left half
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(arr[mid]<target && target <= arr[right]){ // search in right half
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int arr[]={4,5,6,7,0,1,2,}, target =3;

        /*
         * problem statement -Given the array nums after the possible rotation and an integer target, 
         * return the index of target if it is in nums, or -1 if it is not in nums.
           You must write an algorithm with O(log n) runtime complexity.
         */

        System.out.println("Index of target Element : " +search(arr,target));
    }
}
