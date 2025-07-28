public class RemoveDuplicatedFromArr {
    
    public static void main(String args[]){
        int arr[]={1,2,2,2,2,3};
        int n=arr.length;

        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }

        System.out.println("No. of elemenets in arr after removing duplicates : " +(i+1));

    }
}
