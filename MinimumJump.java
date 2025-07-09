public class MinimumJump {
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,2,6,7,6,8,9};
        System.out.println("Minimum jumps required: " + minJumps(arr));
    }

    public static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0;
        if (arr[0] == 0) return -1;

        int jumps = 1, maxReach = arr[0], steps = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxReach = Math.max(maxReach, i + arr[i]);
            

            if (steps == i) {
                jumps++;
                steps = maxReach ;

                if (steps >= arr.length - 1) return jumps;
            }
            if(i >= maxReach) return -1; 
        }
        return -1;
    }
  
}
