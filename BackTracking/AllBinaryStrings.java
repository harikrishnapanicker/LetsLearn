import java.util.*;

public class Main {
// Problem Statement:
//  Given an integer n, generate all possible strings of length n that consist only of '0' and '1'.
// Input: n = 3
// Output: [ "000", "001", "010", "011", "100", "101", "110", "111" ]
    
  static ArrayList<String> result = new ArrayList<String>();

  public static void main(String[] args) {
    int input = 3;
    
    int[] inputArr = {0,0,0};
    solve(0, inputArr);
    System.out.println(result);
  }
  
  static void solve(int i,int[] soln) {
    if (i == soln.length) {
      StringBuilder sb = new StringBuilder();
        for (int num : soln) {
            sb.append(num);
        }
        result.add(sb.toString());
      return;
    } 
    
    soln[i] = 1;
    solve(i + 1, soln);
    
    soln[i] = 0;
    solve (i + 1, soln); 
  }
}
