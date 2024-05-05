//Diagonal Sum [Works only for NxN Matrix only]
public class K2 {
    public static void Brute(int a[][]) {
        // Has a Time Complexity of O(n^2)
        int LRdiagSum = 0;
        int RLdiagSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == j)
                LRdiagSum += a[i][j];
                else if ((i + j) == a.length - 1)
                    RLdiagSum += a[i][j];
            }
        }
        System.out.println("Brute Force Approach:---->");
        System.out.println("--------------------------");
        System.out.println("Left to Right Diagonal Sum=" + LRdiagSum);
        System.out.println("Right to Left Diagonal Sum=" + RLdiagSum);
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println();
    }

    public static void Optimized(int a[][]) {
        // Has a Time Complexity of O(n)
        int LRdiagSum = 0;
        int RLdiagSum = 0;
        for (int i = 0; i < a.length; i++) {
            // For Left to Right Diagonal
            LRdiagSum += a[i][i];
            // For Right to Left Diagonal
            if (i != a.length - i - 1) {
                /*
                 * When the matrix is of ODD amounts of rows and columns then,
                 * to avoid re-addition of middle element in Sum again as it is already present in LRdiagsum
                 * i.e, In the below example for the sum of Matrix a2 elements, re-addition of element 5 is avoided by this 
                 * thus printing the RLdiagsum as 10 instead of 15
                 */
                RLdiagSum += a[i][a.length - i - 1];
            }
        }
        System.out.println("Optimized Approach:---->");
        System.out.println("------------------------");
        System.out.println("Left to Right Diagonal Sum=" + LRdiagSum);
        System.out.println("Right to Left Diagonal Sum=" + RLdiagSum);
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        System.out.println();

    }

    public static void main(String[] args) {
        int a1[][] = { { 1, 2, 3, 4 },
                       { 5, 6, 7, 8 },
                       { 9, 10, 11, 12 },
                       { 13, 14, 15, 16 } };
        int a2[][] = { { 1, 2, 3 },
                       { 4, 5, 6 },
                       { 7, 8, 9 } };
        Brute(a1);
        Optimized(a2);

    }
}