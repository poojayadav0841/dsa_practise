import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MissingAndRepeating {
    
    public static void main(String[] args) {
        
        int arr[]={2,2};
        int n=arr.length;
        int maxNum = -1,minNum =-1;
        int maxFreq= Integer.MIN_VALUE;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
               int key = entry.getKey();
               int value =entry.getValue();

               if(value > maxFreq) {
                maxFreq=value;
                maxNum = key;
               }
        }

        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                minNum=i;
                break;
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(maxNum);
        list.add(minNum);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }


    }
}
