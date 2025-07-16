public class MaxConsecutiveOnes {
    
    public static void main(String[] args) {
        
        int arr[]={1,1,0,1,1,1};
        int maxCount=0,count =0;
        for(int i: arr){
            if(i==1){
                count++;
                maxCount=Math.max(count,maxCount);
            }else{
                count=0;
            }
        }

        System.out.println("Maximum Count = " +maxCount);
    }
}
