public class CountInversion {
    
    public static void main(String[] args) {
        
        int arr[]= {2,4,1,3,5};
        int temp[]= new int[arr.length];

        /* inversion count = if i <j && arr[i]> arr[j] then increment inversion count */

        System.out.println(mergeSortAndCount(arr , temp,0,arr.length-1));
    }

    static int mergeSortAndCount(int arr[], int temp[], int left, int right){
        int inversionCount = 0;
        int mid = (left + right)/2;

        if(left<right) {


        inversionCount +=mergeSortAndCount(arr, temp, left, mid);
        inversionCount +=mergeSortAndCount(arr, temp, mid+1, right);
        inversionCount += mergeAndCount(arr,temp,left, mid, right);
        
        }
        return inversionCount;

    }

    static  int mergeAndCount(int arr[], int temp[], int left, int mid, int right){
        int i=left, j= mid+1, k = left, inversionCount =0;

        while(i<=mid && j<=right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                inversionCount+= (mid-i+1);
            }
        }

        while(i<=mid) temp[k++] = arr[i++];
        while(j<=right) temp[k++] = arr[j++];

        for(int idx=0;idx<=right; idx++){
            arr[idx] = temp[idx];
        }

        return inversionCount;
    }
   
}
