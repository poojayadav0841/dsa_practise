public class BinarySearch {
    
    public static void main(String[] args) {
        
        int arr[]={1,3,6,8,9};
        int target =10;
        int ans=-1;

        int start =0,end = arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(arr[mid]==target) {
                ans = mid;                
                System.out.println(ans);
                return;
            }else if(arr[mid]>target) end = mid-1;
            else start = mid+1;
        }

        System.out.println(ans);
    }
}
