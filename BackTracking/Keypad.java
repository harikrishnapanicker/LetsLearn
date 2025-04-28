import java.util.*;

public class Main {
// You are given a string containing digits from '2' to '9'.
// Return all possible letter combinations that the number could represent.
// The mapping is like this (like old phone keypads):
// Digit	Letters
// 2    	a b c
// 3    	d e f
// 4  		g h i
// 5  		j k l
// 6  		m n o
// 7	  	p q r s
// 8  		t u v
// 9	  	w x y z
// Input: digits = "23"
// Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]

  static String[] keypad = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
  static ArrayList<String> result = new ArrayList<String>();

  public static void main(String[] args) {
    String input = "23";
    solve(input, new String());
    System.out.println(result);
  }
   
  static void solve(String input, String ans) {
    if(input.length() == 0) {
      result.add(ans);
      return;
    }
    int index = (int)input.charAt(0) - '0';
    String val = keypad[index];
    for (char c : val.toCharArray()) { 
      solve(input.substring(1), ans + c);
    }
  }
}
