import java.util.*;

// Given a string s, partition it such that every substring of the partition is a palindrome. 
// Return all possible palindrome partitionings of s.
// 🔹 Input: "aab"
// 🔹 Output: [ ["a", "a", "b"], ["aa", "b"] ]

public class Main {
  
  static ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
  
  public static void main(String[] args) {
    String input = "LIHIL";
    
    solve(input, 0, new ArrayList<String>());
    System.out.println(result);
    
  }
  
  static void solve(String input, int partition, ArrayList<String> soln) {
    if (partition == input.length()) {
      result.add(new ArrayList<String>(soln));
      return;
    }
    
    for(int i = partition; i< input.length(); i++) {
      String prefix = input.substring(partition, i + 1);
      if(isPalindrome(prefix)){
      soln.add(prefix);
      solve(input, i + 1, soln);
      soln.remove(soln.size() - 1);
      }
    }
  }
  
  static boolean isPalindrome(String s) {
    int left = 0, right = s.length() - 1;
    while (left < right) {
      if (s.charAt(left++) != s.charAt(right--)) return false;
    }
    return true;
  }
}
