public class SortColors {
    
    private static void swap(int arr[],int low , int high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
    }
    public static void main(String args[]){
        int arr[]={2,1,0,0,2,1,0};
        int low=0,mid=0,high=arr.length-1;

        while(mid<=high){
            switch(arr[mid]){
                 case 0 : swap(arr,low,mid);
                          low++;
                          mid++;
                          break;
                case 1: mid++;
                        break;
                case 2:swap(arr,mid,high);
                       high--;
                       break;
                default: System.out.println("error occurs");
            
        }
        }

        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
