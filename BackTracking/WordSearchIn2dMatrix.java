import java.util.*;

// Word Search in a 2D Matrix
// Input: A 2D grid of characters, A word (string)
// Output:
// Return true if the word exists in the grid. 
// The word can be constructed from letters of sequentially adjacent cells, where "adjacent" cells
// are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

public class Main {
  static Boolean s = false;

    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "BCCED";

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int[][] visitedNodes = new int[board.length][board[0].length];
                solve(word, 0, i, j, board, visitedNodes);
                if (s) break;
            }
        }

        System.out.println(s ? "T" : "F");
    }

    static void solve(String word, int wordIndex, int i, int j, char[][] arr, int[][] visitedNodes) {
        if (s) return; // early exit if word already found
        if (wordIndex >= word.length()) {
            s = true;
            return;
        }

        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) return;
        if (visitedNodes[i][j] == 1) return;
        if (arr[i][j] != word.charAt(wordIndex)) return;

        visitedNodes[i][j] = 1;

        // explore all 4 directions
        solve(word, wordIndex + 1, i, j + 1, arr, visitedNodes);
        solve(word, wordIndex + 1, i, j - 1, arr, visitedNodes);
        solve(word, wordIndex + 1, i + 1, j, arr, visitedNodes);
        solve(word, wordIndex + 1, i - 1, j, arr, visitedNodes);

        visitedNodes[i][j] = 0; // 🔁 backtrack
    }
}
