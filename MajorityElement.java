public class MajorityElement {
    
    public static void main(String[] args) {
        
        int arr[]={3,1,3};
        int count =0 ,majority =0;

        for(int i : arr){
            if(count ==0) majority = i;
            if(i==majority) count++;
            else count--;
        }

        System.out.print("Majority Element : "+ majority);
    }
}
