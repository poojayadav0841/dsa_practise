public class NthRootOfM {
    
    private  static int nthRootOfM(int n, int m){
        
        int l=1, r =m;

        while(l<=r){
            int mid=(l+r)/2;
            int power =1;
            boolean overflow = false;

            for(int i=0;i<n;i++){
                power *=mid;
                if(power >m){
                    overflow = true; //ignore if power exceeds m
                    break;  
                }
            }

            if(!overflow && power == m) return mid;
            else if(overflow || power >m) r= mid-1;
            else l = mid+1;
        }

        return -1;
    }
    public static void main(String[] args) {
        
        int n=3, m=27;

        /* problem statement-
         * we have to find nth root of m i.e cube root of 27 is 3 else return -1;
         * Approach - binary search - O(log n)
         */
     
         
         System.out.println("Nth root of m : " + nthRootOfM(n,m));

    }
}
