class Solution {
    private static final char P = 'p';
    private static final char R = 'R';
    private static final char B = 'B';
    private static final char S = '.';
    
    public int numRookCaptures(char[][] board) {
        
        int[] R_pos = getRookPosition(board);
        
        int x = R_pos[0];
        int y = R_pos[1];
        int sum = 0;
        
        for (int i = x+1; i < 8; i++) {
            if (board[i][y] == this.P) {
                sum++;
                i = 8;
            } else if (board[i][y] == this.B) {
                i = 8;
            }
        }
        
        for (int i = x-1; i >= 0; i--) {
            if (board[i][y] == this.P) {
                sum++;
                i = -1;
            } else if (board[i][y] == this.B) {
                i = -1;
            }
        }
        
        for (int j = y+1; j < 8; j++) {
            if (board[x][j] == this.P) {
                sum++;
                j = 8;
            } else if (board[x][j] == this.B) {
                j = 8;
            }
        }
        
        for (int j = y-1; j >= 0; j--) {
            if (board[x][j] == this.P) {
                sum++;
                j = -1;
            } else if (board[x][j] == this.B) {
                j = -1;
            }
        }
        
        return sum;
    }
    
    private int[] getRookPosition(char[][] board) {
        int[] pos = new int[2];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == this.R) {
                    pos[0] = i;
                    pos[1] = j;
                    return pos;
                }
            }
        }
        
        return pos;
    }
}