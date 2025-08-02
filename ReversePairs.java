import java.util.ArrayList;
import java.util.List;

public class ReversePairs {
    
     public static  int reversePairs(int[] nums) {
        
        return mergeSort(nums,0,nums.length-1);
    }

    private static int mergeSort(int nums[],int low,int high){
        if(low >= high) return 0;
        int mid = (low + high)/2;
        
        int count=mergeSort(nums,low,mid);
        count += mergeSort(nums,mid+1,high);
        count += mergeAndCount(nums,low,mid,high);

        return count;
    }

    private static int mergeAndCount(int nums[],int low, int mid, int high){
        int count =0;
        int j = mid+1;int left =low, right = mid+1;

        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]> 2L * nums[j]){
                    j++;
            }
            count  += (j - (mid+1));
        }

        List<Integer> temp = new ArrayList<>();

        while(left <= mid && right <=high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }

        while(left <= mid) temp.add(nums[left++]);
        while (right <= high) temp.add(nums[right++]);

        for(int i=low;i<=high;i++){
             nums[i]=temp.get(i-low);
        }

        return count;
    }

    public static void main(String[] args) {
        
        int arr[]={1,3,2,3,1};

        System.out.println("Number of reverse pairs : " +reversePairs(arr));
    }
}
