import java.util.Arrays;

public class HighestFrequencyCount {

  public int maxFrequency(int[] A, long k) {
    Arrays.sort(A);
    long sum = 0;
    int i = 0, res = 0;

    for (int j = 0; j < A.length; j++) {
        sum += A[j];

        // Check if we can afford to make all elements in [i..j] equal to A[j]
        while ((long)A[j] * (j - i + 1) - sum > k) {
            sum -= A[i];
            i++;
        }

        res = Math.max(res, j - i + 1);
    }

    return res;
}

public static void main(String[] args) {
    int A[]={1,2,4};
    long k=5;
    HighestFrequencyCount hfc = new HighestFrequencyCount();
    System.out.println("Maximum frequency: " + hfc.maxFrequency(A, k));
}
  
}
