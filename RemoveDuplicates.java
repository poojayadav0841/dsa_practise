public class RemoveDuplicates {
    
    private static int removeDuplicate(int arr[]){
        int i=1;

        for(int j=1;j<arr.length;j++){
            if(arr[j]!= arr[i-1]){
                arr[i]=arr[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        
        int arr[]={0,0,1,1,1,2,2,3,3,4};

        System.out.println("No. of duplicate elements are : "+removeDuplicate(arr));
    }

}
