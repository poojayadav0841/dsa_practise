import java.util.HashMap;
import java.util.Map;

public class SubarrWithXOR {
    
    public static void main(String[] args) {
        
        int arr[]={4,2,2,6,4};
        int B=6;
        /*
         * we have to return the subarray whose XOR with B matches and return the total count
         */

        Map<Integer, Integer> xorMap=new HashMap<>();
        int xor=0,count =0;

        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];

            if(xor == B) count ++;
            int req = xor ^ B;
            if(xorMap.containsKey(req)){
                count +=xorMap.get(req);
            }
            xorMap.put(xor,xorMap.getOrDefault(xor, 0)+1);

        }

        System.out.println("Total number of subarray are that matches XOR with B = " +count);
    }
}
