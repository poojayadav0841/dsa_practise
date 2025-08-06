

public class SearchInRotatedArrII {
    
    private static boolean search(int []arr,int target){

        int left =0, right =arr.length-1;

        while(left <= right){
           int mid = left + (right - left)/2;

           if(arr[mid]==target){
            return true;
           }

           if(arr[left]==arr[mid] && arr[mid]==arr[target]){ // for duplicate elements
            left++;
            right--;
           }else if(arr[left]<=arr[mid]){
            if(arr[left]<= target && target < arr[mid]){ //left half serch
                right = mid-1;
            }else{
                left = mid+1;
            }
           }else{
            if(arr[mid]< target && target <= arr[right]){// right half search
                left = mid+1;
            }else{
                right = mid-1;
            }
           }
        }
        return false;

    }
    public static void main(String[] args) {
        
        int arr[]={2,5,6,0,0,1,2}, target =3;

        /* problem statement - 
         * Given the array nums after the rotation and an integer target, 
         * return true if target is in nums, or false if it is not in nums.
         * You must decrease the overall operation steps as much as possible.
         * 
         * in this array may contain duplicate elements so check that also
         */

        System.out.println("Index of target Element : " +search(arr,target));
    }
}

