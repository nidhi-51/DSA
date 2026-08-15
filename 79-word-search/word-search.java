class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                if(fun(board, word, "", r, c)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean fun(char[][] board, String word, String p, int r, int c){
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length){
            return false;
        }
        if(board[r][c] == '#'){
            return false;
        }
        char original = board[r][c];
        if(p.length() > word.length() || original != word.charAt(p.length())){
            return false;
        }

        p = p + original;
        if(word.equals(p)){
            return true;
        }

        board[r][c] = '#';

        if(fun(board, word, p, r+1, c)){
            board[r][c] = original;
            return true;
        }
        if(fun(board, word, p, r, c+1)){
            board[r][c] = original;
            return true;
        }
        if(fun(board, word, p, r-1, c)){
            board[r][c] = original; 
            return true;
        }
        if(fun(board, word, p, r, c - 1)){
            board[r][c] = original;
            return true;
        }
        board[r][c] = original;

        return false;
    }
}