//Spiral Matrix
public class K1 {
  public static void main(String[] args) {
    int a[][] = { { 1, 2, 3, 4 },
                  { 5, 6, 7, 8 },
                  { 9, 10, 11, 12 },
                  { 13, 14, 15, 16 } };
    int strRow = 0;
    int endRow = a.length - 1;
    int strCol = 0;
    int endCol = a[0].length - 1;
    while (strRow <= endRow && strCol <= endCol) {
      // Printing TOP Boundary
      for (int j = strCol; j <= endCol; j++) {
        System.out.print(a[strRow][j] + " ");
      }
      // Printing RIGHT Boundary
      for (int j = strRow + 1; j <= endRow; j++) {
        System.out.print(a[j][endCol] + " ");
      }
      // Printing BOTTOM Boundary
      for (int j = endCol - 1; j >= strCol; j--) {
        if(strRow==endRow) {break;}
        System.out.print(a[endRow][j] + " ");
      }
      // Printing LEFT Boundary
      for (int j = endRow - 1; j >= strRow + 1; j--) {
        if(strCol==endCol) {break;}
        System.out.print(a[j][strCol] + " ");
      }
      strRow++;
      strCol++;
      endRow--;
      endCol--;
    }
    System.out.println();
  }
}