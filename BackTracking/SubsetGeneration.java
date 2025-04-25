import java.util.*;
 
// Given an array of distinct integers, return all possible subsets (the power set).
// Input: nums = [1, 2]
// Output: [ [], [1], [2], [1, 2] ]

public class Main {
  
  static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
  
  public static void main(String[] args) {
      
      int[] input = {1,2};
      ArrayList<Integer> subset = new ArrayList<Integer>();
      subsets(input, 0, subset);
      System.out.println(result);
      
      
  }
  
  static void subsets(int[] arr, int i, ArrayList<Integer> subset) {
    if(i == arr.length ) {
      result.add(new ArrayList<Integer>(subset));
      return;
    }
    
    subset.add(arr[i]); 
    subsets(arr, i+1, subset);
    
    subset.remove(subset.size() - 1);
    subsets(arr, i+1, subset);
  }
}
