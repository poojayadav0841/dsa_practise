public class MergeSort {
    
    private static void mergeSort(int arr[],int l,int r){
        //base case 
        if(l>=r) return;

        int mid=l+(r-l)/2;
        mergeSort(arr, l,mid);
        mergeSort(arr, mid+1, r);

        //merge the given array
        merge(arr,l,mid,r);
    }

    private static void merge(int arr[],int l,int mid,int r){
        int n1= mid-l+1;
        int n2=r-mid;

        int left[]=new int[n1];
        int right[]=new int[n2];

        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k++]=left[i++];
            }else arr[k++]=right[j++];
        }

        //for remmaining elements
        while(i<n1) arr[k++]=left[i++];
        while(i<n2) arr[k++]=right[j++];
    }
    public static void main(String[] args) {
        int arr[]={3,2,5,7,1,9,6,5,6};

        int l=0;
        int r=arr.length-1;
        mergeSort(arr,l,r);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
