public class RearrangeArr {
    
    public static void main(String[] args) {
        
        int arr[]={3,1,-2,-5,2,-4};
        int n=arr.length;

        int res[]=new int[n];
        int posI=0, negI=1;
        //keep positive at even pos and negative at odd pos
        for(int num: arr){
           if(num>0){
            res[posI]=num;
            posI+=2;
           }else{
            res[negI] = num;
            negI+=2;
           }
        }

        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }

    }
}
