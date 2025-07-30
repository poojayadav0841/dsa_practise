
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    
    public static void main(String[] args) {
        
        int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
        
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int []> merge = new ArrayList<>();

        for(int interval[]:intervals){
            if(merge.isEmpty() || interval[0]>merge.get(merge.size()-1)[1]){
                merge.add(interval);
            }else{
                merge.get(merge.size()-1)[1]=Math.max(merge.get(merge.size()-1)[1], interval[1]);
            }
        }

        int res[][]=new int[merge.size()][2];
        for(int i=0;i<merge.size();i++){
            res[i]=merge.get(i);
        }

        for(int i[] : res){
            System.out.println(Arrays.toString(i));
        }


        
    }
}
