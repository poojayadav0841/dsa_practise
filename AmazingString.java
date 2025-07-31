import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AmazingString {
    
    public static void main(String[] args) {
        
        String first = "YES", second ="NOT", third = "ONESY";

        Map<Character,Integer> map=new HashMap<>();
        for(char c : first.toCharArray()){
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(char c : second.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        HashMap<Character,Integer> res = new HashMap<>();

        for(char c : third.toCharArray()){
            res.put(c, res.getOrDefault(c,0)+1);
        }

        boolean valid = true;
        for(char c : map.keySet()){
            if(!Objects.equals(res.getOrDefault(c,0), map.get(c))){
                valid=false;
                break;
            }
        }

        

        System.out.println(valid ? "YES" : "NO");
    }
}
