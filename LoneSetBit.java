public class LoneSetBit {
    
    private static int setBit(int n){
        if(n == 0) return  -1;
        if( (n & (n-1)) != 0) return -1;
        int pos =1;
        while(n >1){
            n = n>>1;
            pos +=1;
        }
        return pos;
    }
    public static void main(String[] args) {
        
        int n=4;

        /* problem statement -
         * You are given a single non-negative integer ‘N’ 
         * who’s binary representation consists of a single ‘1’ digit and the rest of the digits are ‘0’s.
         * Your task is to find the position of the only ‘1’ digit. In other words,
         *  your task is to find the position of the only set bit in the binary representation of the input integer ‘N’.
         * The position of the set bit must be counted from the LSB (Least Significant Bit) end of the Binary number.
         *  If the count of set bits in the Binary number is not equal to 1, then your function should return ‘-1’ as output.
         * Example:INPUT   : N = 4
         * OUTPUT  : 3
         */

         System.out.println("Position of lone 1 bit : "+ setBit(n));
    }
}
