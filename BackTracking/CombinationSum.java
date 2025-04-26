import java.util.*;

public class Main {
  
//   Given an array of distinct integers candidates and a target integer target,
// Return all unique combinations of candidates where the chosen numbers sum to target.
// You may reuse the same number unlimited times.

// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
// Explanation: 2+2+3 = 7 , 7 = 7

// Input: candidates = [2,3,5], target = 8
// Output: [[2,2,2,2], [2,3,3], [3,5]]

    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    
    public static void main(String[] args) {
      
      int[] candidates = {2,3,6,7};
      int target = 7;
    
      solve(candidates, target, new ArrayList<Integer>(),0);
      
      System.out.println(result);
      
  }
  
   static void solve(int[] arr, int e, ArrayList<Integer> r, int index) {
     
    if (e == 0) {
      result.add( new ArrayList<Integer>(r));
      return;
    }
    
    if (e < 0) {
      return;
    }
    
    for(int i = index; i< arr.length; i++) {
      r.add(arr[i]);
      solve(arr, e - arr[i], r, i);
      r.remove(r.size() - 1);
    }
  }
}
