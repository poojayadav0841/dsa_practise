

import java.util.*;

public class StringBreak {
    
    private static int stringBreak(String s, int n, String dictionary[]){
        Set<String> dict = new HashSet<>(Arrays.asList(dictionary));
        int dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                String subStr = s.substring(j,i);
                if(dict.contains(subStr) && dp[j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[n]==Integer.MAX_VALUE? -1  : dp[n]-1;
    }
    public static void main(String[] args) {
        
        String s = "CODESTUDIO";
        int n=10;
        String dictionary[] = {"COD","CODE","ESTU", "DIO", "STUDIO"};

        System.out.println("No. of string breaks possible : "+stringBreak(s,n,dictionary));

    }
}
