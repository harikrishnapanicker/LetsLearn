import java.util.*;

public class Main {
// Given an array of integers and a target sum, return all subsets whose elements add up to the target.
// Input: arr = [2, 3, 5] target = 8
// Output: [[3, 5]]
// Explanation: Only one subset of [2, 3, 5] adds up to 8 — [3, 5].

  static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
   
  public static void main(String[] args) {
    
    ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(2,3,5, 7, 1));
    int target = 8;
 
    solve(input, target, 0, new ArrayList<Integer>());
    
    System.out.println(result);
  }
  
  static void solve(ArrayList<Integer> input, int target, int index, ArrayList<Integer> soln) {
     if(target == 0) { 
       result.add(new ArrayList<>(soln));
       return; 
     }
     
     if (index >= input.size() || target < 0) {
      return;
    }
    
    
    // Include current element
    soln.add(input.get(index));
    solve(input, target - input.get(index), index + 1, soln);
    soln.remove(soln.size() - 1);  // backtrack

    // Exclude current element
    solve(input, target, index + 1, soln);
  }
}
