public class FirstAndLastPos {
    
     private static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums,target);
        int last = findLast(nums,target);
        return new int[]{first,last};
    }

    private static int findFirst(int nums[],int target){
        int left=0, right=nums.length-1, idx = -1;

        while(left<=right){
            int mid = left +(right- left)/2;
            if(nums[mid]==target){
                idx=mid;
                right = mid-1; //search in left side
            }else if(nums[mid]<target) left =mid+1;
            else right = mid-1;
        }
        return idx;
    }
        private static int findLast(int nums[],int target){
        int left =0, right=nums.length-1, idx = -1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid]==target){
                idx=mid;
                left = mid+1; //search in right side
            }else if(nums[mid]<target) left =mid+1;
            else right = mid-1;
        }
        return idx;
    }
    public static void main(String[] args) {
        
        int arr[]={2,3,4,4,4,4,6,8};
        int  target=4;

        int res[]=searchRange(arr, target);
        
         System.out.print("first occurence : " + res[0] + " & last occurence : " + res[1]);
        


    }
}
