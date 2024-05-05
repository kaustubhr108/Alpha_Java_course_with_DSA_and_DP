// SEARCHING in SORTED MATRIX(row-wise and column-wise)
public class K3 {
    public static void main(String[] args) {
        int a[][] = { { 10, 20, 30, 40 },
                      { 15, 25, 35, 45 },
                      { 27, 29, 37, 48 },
                      { 32, 33, 39, 50 } };//given matrix is sorted both row-wise and column-wise
        int key = 39;
        StairCaseSearch(a, key);
    }

    public static void StairCaseSearch(int a[][], int key) {
        int row = 0, col = a[0].length - 1;
        while (row < a.length && col >= 0) {
            if (a[row][col] == key) {
                System.out.println(key + " Found at [" + row + "," + col + "]");
                System.exit(0);
            } else if (key < a[row][col])
                col--;
            else
                row++;
        }
        System.out.println("Key Not FOUND!!!");
    }
}
