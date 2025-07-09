public class StringReverse {

  public static void main(String[] args) {
      
    char s[] = {'h','e','l','l','o'};

    /*
     * pseudo code : using two pointer approach
     * reverseHelper(s, 0 ,s.length-1){
     * if(start>=end) return;
     * char temp=s[start];
     * s[start]=s[end];
     * s[end]=temp;
     * reverseHelper(s,start+1,end-1);
     * }
     */

      reverseStringHelper(s, 0, s.length-1);
      System.out.println("Reversed string is: " + String.valueOf(s));
  }

  public static void reverseStringHelper(char[]s , int start, int end){
    if(start >=end) return;
    char temp=s[start];
    s[start]=s[end];
    s[end] = temp;
    reverseStringHelper(s, start+1, end-1);
  }
  
}
