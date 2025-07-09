import java.util.*;

public class FrequencyCount{

  public static void main(String args[]){
    int arr[]={2,3,2,3,5};

    /*
     * approach : Using hashing technique -O(n) & O(n)
     * int n =arr.length;
     * int freq[]=new int[n];
     * for(int val :arr) if(val>=1 && val<=n)arr[val-1]++; bcz idx starts from 0
     * list to store the result and return
     * for(int f : freq) list.add(f);
     * return f
     * 
     * using optimized approach  - Inplace frequency count O(n) & O(1)
     * int n=arr.length;
     * for(int i=0;i<n;i++) arr[i]=arr[i]-1; //to make it 0 based index
     * 
     * for(int i=0;i<n;i++) arr(arr[i] % n) +=n; // to store the frequency at the index
     * list to store the result and return
     * for(int i=0;i<n;i++) list.add(arr[i]/n);
     * return list;
     */

     int n=arr.length;

     FrequencyCount(arr,n);
     OptimizedFrequencyCount(arr,n);

  }

  private static void FrequencyCount(int arr[],int n){
    int freq[]=new int[n];
    for(int val:arr){
      if(val>=1 && val<=n) freq[val-1]++; //bcz idx starts from 0, so val-1
    }

    List<Integer> list=new ArrayList<>();
    for(int f: freq) list.add(f);
    System.out.println("Frequency Count using Hashing Technique: " + list);
  }

  public static void OptimizedFrequencyCount(int arr[],int n){
    for(int i=0;i<n;i++) arr[i]=arr[i]-1; //to make it 0 based index

    for(int i=0;i<n;i++) arr[arr[i] % n] +=n; // to store the frequency at the index

    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++) list.add(arr[i]/n);
    System.out.println("Frequency Count using Optimized Approach: " + list);
  }
}