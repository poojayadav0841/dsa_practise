public class MergeSortArr {
    
    public static void main(String[] args) {
        
        int num1[]={1,2,3,0,0,0}, num2[]={2,5,6};
        int m=3,n=3;

        /* problem statement = we have to sort and merge the array in num1 without taking extra space */

        int p1=n-1, p2=n-1,i=m+n-1;

        while(p1>=0 && p2>=0){
            if(num1[p1]>num2[p2]){
                num1[i]=num1[p1];
                p1--;
            }else{
                num1[i]=num2[p2];
                p2--;
            }
            i--;
        }

        //for remaining element
        while(p2>=0){
            num1[i]=num2[p2];
            p2--;
            i--;
        }

        for(int j=0;j<num1.length;j++){
           System.out.print(num1[j]+" ");
        }
    }
}
