
import java.util.ArrayList;
import java.util.HashMap;
import  java.util.List;
import java.util.Map;

public class MajorityElementII {
    
    public static void main(String[] args) {
        
        int arr[]={3,1,3,4,4};
        int n=arr.length;

        HashMap<Integer, Integer> majorityElement = new HashMap<>();

        for(int i=0;i<n;i++){
            majorityElement.put(arr[i],majorityElement.getOrDefault(arr[i], 0)+1);
        }

        List<Integer> res = new ArrayList<>();
        int threshold=n/3;

        for(Map.Entry<Integer, Integer> entry : majorityElement.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();
            if(count>threshold){
                res.add(element);
            }
        }

        for(int i=0;i<res.size();i++){
           System.out.print(res.get(i)+" ");
        }
    }
}
