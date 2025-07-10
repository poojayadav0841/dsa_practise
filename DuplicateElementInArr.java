import java.util.HashSet;

class DuplicateElementInArr{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,};
        int duplicate=-1;

        /*pseudeo code- 
         * create hashset and check if it contains the duplicate element 
         * if not add to the set else return that num
         */

         HashSet<Integer> hs=new HashSet<>();
         for(int num:arr){
            if(hs.contains(num)){
                // System.out.print(num);
                duplicate=num;
                break;
            }
            hs.add(num);
         }
          if (duplicate != -1) {
            System.out.println("Duplicate element is present in the given array: " + duplicate);
        } else {
            System.out.println("No duplicate element found.");
        }
    }
}