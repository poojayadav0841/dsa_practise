public class MaxProductSubarr {
    
    public static void main(String[] args) {
        
        int arr[]= {2,3,-2,4};

        int maxProd = arr[0], minProd=arr[0], globalMax = arr[0];

        for(int i=1; i<arr.length ;i++){
            int num =arr[i];

            int prevMax = maxProd , prevMin =minProd;

            maxProd = Math.max(num, Math.max(num * prevMax, num * prevMin));
            minProd = Math.min(num, Math.min(num * prevMax, num * prevMin));

            globalMax = Math.max(globalMax , maxProd);
        }

        System.out.println("Maximum Product of subarr : " +globalMax);
    }
}
