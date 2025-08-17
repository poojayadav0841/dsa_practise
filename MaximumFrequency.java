import java.util.HashMap;
import java.util.Map;
public class MaximumFrequency {
    
    private static int freqCount(int arr[]){

        Map<Integer,Integer> frequency  = new HashMap<>();
        Map<Integer,Integer> firstIdx = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num =arr[i];

            frequency.put(num, frequency.getOrDefault(num,0) +1);

            if(!firstIdx.containsKey(num)){
                firstIdx.put(num,i);
            }
        }

        int res=0, maxFreq=-1;
        for(int  num : frequency.keySet()){
            int f = frequency.get(num);

            if(f > maxFreq){
                maxFreq = f;
                res =num;
            }else if(f == maxFreq){
                if(firstIdx.get(num) < firstIdx.get(res)){
                    res = num;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,1,3,2,3,3,3};

        /* problem statement -
         * we have to return the element which has maximum number of repetition in the array and 
         * if two element has same frequency then return the which is present first idx in the array
         * 
         * Approach - use HashMap 
         */

        System.out.println("Maximum Frequency count element which occur first in the given array : " +freqCount(arr));
    }
}
