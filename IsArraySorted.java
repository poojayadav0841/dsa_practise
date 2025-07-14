public class IsArraySorted {

    private static boolean isSorted(int arr[]){

        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[(i+1) % arr.length]) count++;
            if(count >1) return false;
        }
        return true;
    }

    public static void main (String args[]){
        int arr[]={3,4,5,1,2};

        /*check if array is sorted after one rotation */
        
        System.out.println("Is Array Sorted ?"+isSorted(arr));
    }
}
