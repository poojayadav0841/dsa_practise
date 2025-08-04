public class InsertPosIdx {
    
    public static void main(String[] args) {
        
        int arr[]={1,3,5,6}, target =2;

        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
       
        System.out.println(low);

    }
}
