import java.util.*;
public class Fibbonacci {
 
  public static void main(String args[]){
    int n = 10; // Example input
    System.out.println("Fibonacci series up to " + n + ":");
    /*
     * approach 1: using recursion if(n<=1) return n; return fib(n-1) + fib(n-2);
     * 
     * approach 2: using memoizatio in dp
     * int arr[]=new int[n+1]
     * Arrays.fill(arr,-1);
     * return helper(n,arr)
     * 
     * helper(arr,n){
     * if(n<=1) return n;
     * if(arr[n] != -1) return arr[n]; //already computed so return original value
     * int ans=helper(n-1,arr)+helper(n-1,arr);
     * arr[n]=ans; //to store the computed result
     * return ans;
     * }
     */

     int arr[]=new int[n+1];
     Arrays.fill(arr,-1);
     System.out.println("Fibbonacci number : "+ helper(n,arr));
  }

  private static int helper(int n,int arr[]){
    if(n<=1) return n;
    if(arr[n] !=-1) return arr[n];
    int ans=helper(n-1,arr)+helper(n-2,arr);
    arr[n]=ans;
    return ans;
  }
}
