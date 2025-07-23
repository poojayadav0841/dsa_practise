public class NextPermutation {
    
        public static  void nextPermutation(int[] nums) {
        int n=nums.length;
        int i = n-1;
        while(i>0 && nums[i-1]>=nums[i]) i--;
        if(i ==0){
            reverse(nums,0,n-1);
            return;
        }

        int j=n-1;
        while(j>0 && nums[i-1]>=nums[j]) j--;
        swap(nums,i-1,j);
        reverse(nums,i,n-1);
    }

    private static  void swap(int nums[],int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    private static void reverse(int nums[], int start,int end){
        while(start <end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        nextPermutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

}
