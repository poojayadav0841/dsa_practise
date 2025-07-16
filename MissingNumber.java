public class MissingNumber {
    
    public static void main(String[] args) {
        
        int arr[]={0,1,2,3,4,6,7};
        int n=arr.length;

        int expectedSum = n * (n+1)/2;
        int actualSum=0;
        for(int i :arr) actualSum+=i;

        System.out.println("Missing element : " + (expectedSum-actualSum));
    }
}
