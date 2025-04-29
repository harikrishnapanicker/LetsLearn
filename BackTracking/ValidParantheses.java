import java.util.*;

public class Main {
// Given n pairs of parentheses, generate all combinations of well-formed (valid) parentheses.

// Input: n = 2
// Output: ["(())", "()()"]

// Input: n = 3
// Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
    
  static ArrayList<String> result = new ArrayList<String>();

  public static void main(String[] args) {
    int input = 3;
 
    solve(0,0, 3,""); 
    
    System.out.println(result);
  }
  
  static void solve(int opn, int clos, int n, String soln) {
    if (soln.length() == 2 * n) { 
      result.add(soln);
      return;
    }
    
    if (opn < n) {
     solve(opn+1,clos,n, soln + '(');
    }
     
    if (clos < opn) {
     solve(opn, clos+1,n, soln + ')');
    }
  }
}
