import java.util.Arrays;

public class CompareVersionNumber {

    private static int compareVersionNumber(String a, String b){
        String A[]=a.split("\\.");
        String B[] = b.split("\\.");

        A= trimTrailingZeros(A);
        B= trimTrailingZeros(B);
        
        int n=Math.max(A.length, B.length);

        for(int i=0;i<n;i++){
            String partA= (i< A.length)? A[i] : "0";
            String partB= (i<B.length) ? B[i] : "0";

            int cmp = compareNumericString(partA,partB);

            if(cmp !=0) return  cmp;
        }

        return 0;
    }
    
    private static String[] trimTrailingZeros(String arr[]){
        int end=arr.length-1;
        while(end>=0 && stripLeadingZeros(arr[end]).equals("0")) end--;
        return Arrays.copyOf(arr,end+1);
    }

    private static int compareNumericString(String a, String b){
        a=stripLeadingZeros(a);
        b=stripLeadingZeros(b);

        if(a.length() != b.length()){
           return (a.length() > b.length())? 1 : -1;
        }

        int res = a.compareTo(b);
        if(res>0) return 1;
        if(res<0) return -1;
        return  0;

    }

    private static String stripLeadingZeros(String s){
        int i=0, n= s.length();
        while(i <n && s.charAt(i)=='0') i++;
        return (i==n) ? "0" : s.substring(i);
    }
    public static void main(String args[]){
        String s1= "10.2.2", s2="10.2.2";

        /* problem statement-
         * You are given two versions numbers A and B as a string. 
         * Your task is to compare them and find out which one of them is a newer version.
         * Note:There are no leading zeros in any of the strings except in the case of zero itself.
         *  Note that, the leading zeroes are not allowed even after a '.' ie: 121.005 is an invalid version,
         *  while 121.5 is an valid version.
         * For Example:A = “1.23.45”, B = “1.23.456”
         * The first two parts of both the strings are the same i.e 1 and 23 and 
         * the third part of B is greater than the third part of A i.e. 45 < 456, thus string B is the latest version.
         */

         System.out.println("is any update version available : "+compareVersionNumber(s1,s2));
    }
}
