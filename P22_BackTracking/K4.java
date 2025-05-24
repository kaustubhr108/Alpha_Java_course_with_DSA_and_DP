// N Queens Problem (All Ways)
// RECOMMENDATION ---> See the code for "QueenOverview.java" first
public class K4 {
    public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];
        // initialize the chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
        nQueens(chessBoard, 0);
    }
    public static boolean isSafe(char board[][],int row,int col) {
        //vertically Up Check
        for (int i = row-1; i >= 0; i--) {
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonally left Up Check
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonally right Up Check
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int rowNo) {
        // Base case
        if (rowNo == board.length) {
            printBoard(board);
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
