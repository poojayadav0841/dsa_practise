
import java.util.ArrayList;

public class RotateArrayByK {
    
    public static void main(String args[]){
        int arr[]={1,2,3,4,5}, k=2;

        int n=arr.length;
        k = k % n;
        ArrayList<Integer>  res=new ArrayList<>();

        for(int i=k;i<n;i++){
            res.add(arr[i]);
        }

        for(int i=0;i<k;i++){
            res.add(arr[i]);
        }

        for(int i=0;i<n;i++){
            System.out.print(res.get(i) + " ");
        }

    }
}
