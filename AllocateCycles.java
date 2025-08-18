import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AllocateCycles {
    
    static class Pair implements Comparable<Pair> {
        int dist;
        int student;
        int cycle;

        Pair(int d, int s, int c) {
            this.dist = d;
            this.student = s;
            this.cycle = c;
        }

        // Sorting: distance → student index → cycle index
        @Override
        public int compareTo(Pair other) {
            if (this.dist != other.dist)
                return this.dist - other.dist;
            else if (this.student != other.student)
                return this.student - other.student;
            else
                return this.cycle - other.cycle;
        }
    }

    public static ArrayList<Integer> allocateCycles(ArrayList<ArrayList<Integer>> students, ArrayList<ArrayList<Integer>> cycles)
    {
        int N = students.size();
        int M = cycles.size();

        // Step 1: Compute all distances
        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int sx = students.get(i).get(0);
            int sy = students.get(i).get(1);
            for (int j = 0; j < M; j++) {
                int cx = cycles.get(j).get(0);
                int cy = cycles.get(j).get(1);
                int dist = Math.abs(sx - cx) + Math.abs(sy - cy);
                pairs.add(new Pair(dist, i, j));
            }
        }

        // Step 2: Sort pairs
        Collections.sort(pairs);

        // Step 3: Greedy assignment
        ArrayList<Integer> result = new ArrayList<>(Collections.nCopies(N, -1));
        boolean[] studentAssigned = new boolean[N];
        boolean[] cycleAssigned = new boolean[M];

        int assignedCount = 0;
        for (Pair p : pairs) {
            if (!studentAssigned[p.student] && !cycleAssigned[p.cycle]) {
                result.set(p.student, p.cycle);
                studentAssigned[p.student] = true;
                cycleAssigned[p.cycle] = true;
                assignedCount++;
                if (assignedCount == N) break;
            }
        }

        return result;  
    }
    public static void main(String[] args) {
        
       ArrayList<ArrayList<Integer>> students = new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList(2, 1)),
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(3, 3)),
                new ArrayList<>(Arrays.asList(2, 2))
            )
        );

        ArrayList<ArrayList<Integer>> cycles = new ArrayList<>(
            Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 1)),
                new ArrayList<>(Arrays.asList(2, 1)),
                new ArrayList<>(Arrays.asList(2, 2)),
                new ArrayList<>(Arrays.asList(2, 1))
            )
        );
        
        /*problem statmenet-
         * A school campus is represented as a 2D grid. 
         * The campus has N students and M cycles, and the number of students are less than or equal to the number of cycles.
         *  Each student and cycle is represented as a 2D coordinate (X, Y) on this grid.
         * Our goal is to assign exactly one cycle to each student.
         *  Among the available cycles and students, we choose the (student, cycle)
         *  pair with the shortest Manhattan distance between each other, and assign the cycle to that student. 
         * If there are multiple (student, cycle) pairs with the same shortest Manhattan distance, 
         * we choose the pair with the smallest student index; if there are multiple ways to do that, 
         * we choose the pair with the smallest cycle index. We repeat this process until a cycle is assigned to each student.
         * Given the description of the school campus, 
         * your task is to find the index (0-based) of the cycle that is assigned to each student.
         * The Manhattan distance between two points P1 and P2 is defined as D = |P1.X - P2.X| + |P1.Y - P2.Y|
         *  where X, Y represents the location of a point in both horizontal as well as vertical direction respectively from the origin(0,0).
         */

        System.out.println("Cycles allocated : "+allocateCycles(students,cycles));
    }
}
