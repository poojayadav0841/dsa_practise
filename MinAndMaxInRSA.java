public class MinAndMaxInRSA {

    private static int minElement(int arr[]){
        int l=0,r=arr.length-1;
        while(l<r){
            int m= l + (r-l)/2;
            if(arr[m]>arr[r]) //search in right half
             l = m+1;
            else r=m;

        }
        return arr[l];
    }

    private static int maxElement(int arr[]){
        int l=0,r=arr.length-1;
        while(l<r){
            int m= l + (r-l)/2;

            if(arr[m]>arr[m+1]) return arr[m];// max values
            if(arr[m]>arr[r]){
                l = m+1;
            }else r = m;
        }

        return arr[(l-1 + arr.length) % arr.length];
    }
    
    public static void main(String[] args) {
        
        int arr[]={3,4,5,6,1,2};

        /*
         * problem statement-
         * find min and max value in rotated sorted array in log(n) times
         */

        System.out.println("Minimum element in RSA : "+minElement(arr));
        System.out.println("Maximum element in RSA : "+maxElement(arr));
    }
}
