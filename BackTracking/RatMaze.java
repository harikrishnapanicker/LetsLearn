import java.util.*;

public class Main {

// Problem Statement:
//   You are given an n x n maze represented as a 2D array.
//   A cell maze[i][j] can be:
//   1 → Open path (rat can move here)
//   0 → Wall (rat cannot move here)
//   The rat starts at the top-left cell (0, 0).
//   The goal is to reach the bottom-right cell (n-1, n-1).
// Rules:
//   You can only move Down, Right, Up, or Left.
//   You cannot visit the same cell twice in the same path.
//   You must only move through cells that have 1.
// Task:
//   Print all possible paths from start to finish.
//   Each path should be a string of directions, like:
//   "DRDDRR" (D=Down, R=Right, U=Up, L=Left)
//   If no path exists, return an empty list.

// Input:
// maze = [
// [1, 0, 0, 0],
// [1, 1, 0, 1],
// [0, 1, 0, 0],
// [1, 1, 1, 1]
// ]

// Output:
// [DRDDRR"]


  static int[][] input = {
  {1, 0, 0, 0},
  {1, 1, 0, 1},
  {0, 1, 0, 0},
  {1, 1, 1, 1}
};
    
  static ArrayList<String> result = new ArrayList<String>();

  public static void main(String[] args) {
    solve(0,0,"");
    System.out.println(result);
  }
  
    static void solve2(int i, int j, String res) {
    
    
    // Move Down
    if (i < input.length - 1) {
      solve(i + 1, j, res + "D");
    }
    
    // Move Right
    if (j < input[0].length - 1) {
      solve(i, j + 1, res + "R");
    }
  }
  
  static void solve(int i, int j, String res) {
    if(i== input.length - 1 && j == input[0].length -1) {
      result.add(res);
      return;
    }
    if(input[i][j] == 0) { 
      return;
    }
    
    if(i < input.length - 1) {
      solve(i+1, j, res + "D");
    }
    
    if(j < input[0].length - 1) {
      solve(i, j+1, res + "R");
    }
  }
}
