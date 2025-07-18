
import java.util.HashMap;

public class TwoSumIdx {

    public static void main(String[] args) {

        int arr[] = { 2, 7, 11, 15 };
        int target = 9;

        /*
         * problem statement - we have two return the idx of that two number whose
         * sum==target
         * approach - use HashMap to store the value and compare with the target
         * 
         */

        HashMap<Integer, Integer> map = new HashMap<>();
        int res[] = { -1, -1 };
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                res[0] = map.get(complement);
                res[1] = i;
                found = true;
                break;
            }

            map.put(arr[i], i);
        }

        if (!found) {
            System.out.println("No such elements found.");
        } else {
            System.out.println(res[0] + " " + res[1]);
        }
    }
}
