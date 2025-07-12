public class SecondLargeElement {

    static int secondLargest(int arr[]){
        int max=arr[0];
        int secondMax=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]!= max && arr[i]>secondMax) secondMax=arr[i];
        }

        if(secondMax==Integer.MIN_VALUE ) return -1;
        else return secondMax;
    }
    public static void main(String[] args) {
        int arr[]={3,25,23,55,33};

        System.err.println(secondLargest(arr));
    }
    
}
