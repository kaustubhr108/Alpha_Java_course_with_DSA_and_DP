//This program prints all possible ways in which a Chessboard can be filled with queens
public class QueenOverview {
    public static void main(String[] args) {
        int n=2;
        char chessBoard[][]=new char[2][2];
        // int n=3;
        // char chessBoard[][]=new char[3][3];
        //initialize the chessboard
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j]='X';   
            }
        }
        nQueens(chessBoard,0);
    }    
    public static void nQueens(char board[][],int rowNo) {
        // Base case
        if(rowNo==board.length){
            printBoard(board);
            return;
        }
        // Column Loop
        for (int j = 0; j < board.length; j++) {
            board[rowNo][j]='Q';
            nQueens(board, rowNo+1); //fn call
            board[rowNo][j]='X'; // backtracking step
        }
    }
    public static void printBoard(char board[][]) {
        System.out.println("-*-*-*-*-*-CHESS BOARD-*-*-*-*-*-");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
