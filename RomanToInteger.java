public class RomanToInteger {
    
    private static int romanNumber(String s){
        int values[] = new int[26];
        values['I'-'A']=1;
        values['V'-'A']=5;
        values['X'-'A']=10;
        values['L'-'A'] = 50;
        values['C'-'A']=100;
        values['D'-'A']=500;
        values['M'-'A']=1000;

        int res =0;
        for(int i=0;i<s.length()-1;i++){
            int curr = values[s.charAt(i) - 'A'];
            int next = values[s.charAt(i+1) - 'A'];

            if(curr < next){
                res -= curr;
            }else{
                res +=curr;
            }
        }
        res += values[s.charAt(s.length()-1)- 'A'];
        return res;
    }
    public static void main(String[] args) {
        
        String s ="VII";

        /* probem statement -
         * convert given string into roman number
         */

         System.out.println("Roman number for the given string : "+romanNumber(s));
    }
}
