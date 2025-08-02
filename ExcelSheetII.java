public class ExcelSheetII {
    
    public static void main(String[] args) {
        
        String str = "AB";
        int res=0;

        /* problem statement - we have to print the excel column for eg. if A - then 1 , AB-28 */
        for(char c : str.toCharArray()){
           int  val = c - 'A'+1;
            res = res *26 +val;
        }

        System.out.println("Excel column  " +str +" : " + res);
    }
}
