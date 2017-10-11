// Question: https://leetcode.com/problems/word-search/

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (search(word, 0, board, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean search(String word, int nextIdx, char[][] board, int boardY, int boardX) {
        if (nextIdx == word.length()) {
            return true;
        }

        if (boardX >= board[0].length || boardX < 0 || boardY >= board.length || boardY < 0) {
            return false;
        }

        if (board[boardY][boardX] != word.charAt(nextIdx)) {
            return false;
        }

        char c = board[boardY][boardX];
        board[boardY][boardX] = '#';

        boolean found = search(word, nextIdx + 1, board, boardY + 1, boardX) ||
                search(word, nextIdx + 1, board, boardY - 1, boardX) ||
                search(word, nextIdx + 1, board, boardY, boardX + 1) ||
                search(word, nextIdx + 1, board, boardY, boardX - 1);
        board[boardY][boardX] = c;
        return found;
    }
}
