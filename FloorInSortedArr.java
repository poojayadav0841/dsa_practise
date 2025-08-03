public class FloorInSortedArr {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,8,10,10,12,19};
        int x= 5;
        /*
         problem statement -Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

         Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

         Examples

         Input: arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5
         Output: 1
         Explanation: Largest number less than or equal to 5 is 2, whose index is 1
         */

         int start = 0,end = arr.length-1, ans =-1;

         while(start <=end){
            int mid = start +(end -start)/2;
            if(arr[mid]<=x){
                ans = mid;
                start = mid+1;
            }else end= mid-1;
         }

         System.out.print(ans);
    }
}
