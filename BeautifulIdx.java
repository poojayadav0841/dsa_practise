public class BeautifulIdx {
    
    public static void main(String[] args) {
        
        int arr[]={1,1,1};

        int n=arr.length;

        int total = 0 , prefix =0;

        for(int i : arr){
            total += i;
        }

        for(int i=0;i<n;i++){
            if(2 * prefix + arr[i] == total){
                System.out.print(i+1);
                return;
            }
            prefix +=arr[i];
        }

        System.out.println(-1);
    }
}
