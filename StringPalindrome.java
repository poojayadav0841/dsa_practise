public class StringPalindrome {

  public static boolean isPalindrome(String s){
    int l=0, r=s.length()-1;

    while(l<=r){
      char ch1=Character.toLowerCase(s.charAt(l));
      char ch2=Character.toLowerCase(s.charAt(r));
      if(ch1 >='a' && ch1<='z' || ch1>='0' && ch1<='9'){
        if(ch2>='a' && ch2<='z' || ch2>='0' && ch2<='9'){
          if(ch1 != ch2) return false;
          l++;
          r--;
          
        }else {
          r--;
        }
      }else{
        l++;
      }
    }
    return true;
  }
  public static void main(String[] args) {
      
    String str="madam";
    /*
     * pseudo code : using two pointer approach
     * isPalindromeHelper(s, 0 ,s.length-1){
     * if(start>=end) return true;
     * if(s[start]!=s[end]) return false;
     * return isPalindromeHelper(s,start+1,end-1);
     * }
     */

     System.out.println("reverse of the string : " +isPalindrome(str));
  }  
}
