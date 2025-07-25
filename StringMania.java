public class StringMania {

    public static void main(String args[]){

        String str1 ="abc", str2="ab";

        int n=str1.length(), m=str2.length();
        int minLen=Math.min(n,m);

        for(int i=0;i<minLen;i++){
           if(str1.charAt(i)>str2.charAt(i)) System.out.println("1");
           else if(str1.charAt(i)<str2.charAt(i)) System.out.println("-1");
        }

        if(n>m) System.out.println("1");
        else if(n<m) System.out.println("-1");
        else System.out.println("0");
    }
    
}
