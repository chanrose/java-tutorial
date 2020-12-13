package oldPack;

public class nQueen {
    // "n" is number of row, column, and queen, "chessboard" is the chess board
    int n;
    int[][] chessboard;


    void createBoard(int n) {
        // Create chessboard
        chessboard = new int[n][n];
        this.n = n;

        // Fill default chess board with 0 "zero" in which is not under the attack
        for (int i=0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                chessboard[i][j] = 0;
            }
        }
    }

    void displayBoard() {
        System.out.println(" Chessboard: ");
        for (int i=0; i<n; i++) {
            System.out.print("[ ");
            for (int j = 0; j<n; j++) {
                // Because we will fill Queen with number 5 and at the end we want 5 to display Q instead of 5whi
                if (chessboard[i][j] == 5) System.out.print("Q ");
                else
                System.out.print(chessboard[i][j] + " ");
            }
                System.out.println("] ");
        }
    }

    // I plan to do the recursive and backtracking but somehow I still stuck here.
    void placeQueen(int queen, int startR, int startC) {
        if (queen==0) {
          displayBoard();
        } else {
            if((availableCol(startR, startC) == true)) {
                queen--;
                System.out.println(queen);
                addMark(startR, startC);
                placeQueen(queen, startR++, startC);
                System.out.println(queen +" row: "+startR +" column: "+ startC);
            } else if (startC + 1 < n) {
                placeQueen(queen, startR, startC++);
                System.out.println(queen + " row: " + startR + " column: " + startC);
            } else {
                placeQueen(queen--, startR--, startC++);
            }


        }
    }

    void addMark(int pRow, int pCol) {
        // pRow and pCol is like a marked row and column that you want to place queen
        // r refers to row, and cr refers to increment of column and cl is decrement of column
        int r, cr, cl;
        r= pRow;
        cr = pCol;
        cl = pCol;
        boolean exitl, exitr; // I use it to make a loop for checking the columns for it to be diagonal usage
        exitl = false;
        exitr = false;
        for (int row = 0; row < n; row++) {
            for (int i = 0; i <n; i++) {
                r++;
                chessboard[pRow][i] = 1;
                chessboard[i][pCol] = 1;
                if (exitl == false && r < n) { // check left diagonal
                    if (cl == 0) exitl = true;
                    else {
                        if (cl > 0) {cl--;
                        chessboard[r][cl] = 1;}
                    }

                }
                if (exitr == false && r < n) { // check right diagonal
                    if (cr == n-1) exitr = true; else {
                        if (cr + 1 < n) {cr++;
                        chessboard[r][cr] = 1;}
                    }

                }


            }
            chessboard[pRow][pCol] = 5; // Queen marked
        }

    }

    boolean availableCol(int r, int c) {
        // To check whether the column is empty or not
        if (chessboard[r][c] == 0) return true;
        else
        return false;
    }



    public static void main(String[] args) {
        nQueen obj = new nQueen();
        obj.createBoard(8); // Amount of row, columns, and queens
        obj.addMark(0,1);
        obj.addMark(1,3);
        obj.displayBoard();

    }
}
