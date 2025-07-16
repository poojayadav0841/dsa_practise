import java.util.*;

public class Union {
    
    public static void main(String args[]){
        int arr1[]={1,2,4};
        int arr2[]={3,1,2,5};

        Set<Integer> set=new TreeSet<>();

        for(int i:arr1) set.add(i);
        for(int i:arr2) set.add(i);

        for(int i : set){
            System.out.print(i + " ");
        }
        
    }
}
