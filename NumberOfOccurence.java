public class NumberOfOccurence {
    
    static int countFreq(int[] arr, int target) {
        // code here
        // int count =0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==target){
        //         count++;
        //     }
        // }
        // return count;
        
        //optimized approach
        
        int first = findFirst(arr,target);
        if(first == -1) return 0;
        int last = findLast(arr,target);
        return last-first+1;
    }
    public static int findFirst(int nums[],int target){
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
        public static  int findLast(int nums[],int target){
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
        
        int arr[]= {1,2,3,3,3,4,6};
        int target = 3;

        System.out.println("Number of occurence of target element : " + countFreq(arr, target));


    }
}
