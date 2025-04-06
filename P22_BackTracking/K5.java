// N Queens Problem (Count Ways)
// in this, instead of printing the board when the base case is hit, we will INCREASE COUNT
public class K5 {
    static int count=0;
    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[4][4];
        // initialize the chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        nQueens(chessBoard, 0);
        System.out.println("Total ways:"+count);
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically Up Check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonally left Up Check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonally right Up Check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int rowNo) {
        // Base case
        if (rowNo == board.length) {
            // printBoard(board);
            count++;
            return;
        }
        // Column Loop

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, rowNo, j)) {
                board[rowNo][j] = 'Q';
                nQueens(board, rowNo + 1); // fn call
                board[rowNo][j] = 'X'; // backtracking step
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-*-*-*-*-*-CHESS BOARD-*-*-*-*-*-");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
