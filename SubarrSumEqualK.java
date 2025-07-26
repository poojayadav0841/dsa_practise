
import java.util.HashMap;

public class SubarrSumEqualK {
    
    public static void main(String[] args) {
        
        int arr[]={1,1,1};
        int k=2;

        int count = 0, prefixSum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int num:arr){
            prefixSum += num;
            if(map.containsKey(prefixSum-k)){
                count += map.get(prefixSum-k);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum, 0)+1);
        }

        System.out.println(count);

    }
}
