public class MedianofTwoSortedArrays {
    
    private static double findMedianSortedArrays(int nums1[], int nums2[]){
        if(nums1.length > nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int m=nums1.length, n =nums2.length;
        int left =0, right =m;
        int half = (m+n+1)/2;
        while(left <= right){
            int i= (left+right)/2;
            int j=half-i;

            int left1 = (i==0)? Integer.MIN_VALUE : nums1[i-1];
            int right1= (i==m) ? Integer.MAX_VALUE: nums1[i];

            int left2= (j==0) ? Integer.MIN_VALUE : nums2[j-1];
            int right2 =(j==n)? Integer.MAX_VALUE : nums2[j];

            if(left1<= right2 && left2<= right1){
                if((m+n)%2==0){ //if even
                    return (Math.max(left1,left2) + Math.min(right1,right2))/2.0;
                }else{
                    return Math.max(left1,left2); //if odd
                }
            }else if(left1 > right2){
                right = i-1;
            }else{
                left =i+1;
            }
        }
        throw new  IllegalArgumentException();

    }
    public static void main(String[] args) {
        
        int nums1[]={1,3}, nums2[]={2,4};

        /*problem statement-
         * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
         * The overall run time complexity should be O(log (m+n))
         */

        System.out.println("Median of two sorted Arrays : "+findMedianSortedArrays(nums1,nums2));
    }
}
