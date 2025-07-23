import java.util.HashSet;

public class LongestConsecutiveSeq {
    
    static int longestConsecutiveSeq(int arr[]){

        int n=arr.length;
        if(n == 0) return 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num  :arr) set.add(num);

        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int currNum = num;
                int count =1;
                while(set.contains(currNum +1)){
                    currNum++;
                    count++;
                }

                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        
        int arr[]={0,3,1,2,5,8,4,6,7,9};
        
        System.out.println(longestConsecutiveSeq(arr));

        
    }
}
