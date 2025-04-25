import java.util.*;
 
// Given a string s, return all possible permutations of the characters in the string.
// You may assume the string contains no duplicate characters for now.
// Input : s = "abc"
// Output: abc acb bac bca cab cba

public class Main {
  
  static ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
  
  public static void main(String[] args) {
      String[] input = {"a","b","c"};
      permutations(input,0);
      
      System.out.println(result);
  }
  
  static void permutations(String[] arr, int i) {
    if(i == arr.length) { 
      result.add(new ArrayList<String>(Arrays.asList(arr)));
      return;
    }
    
    for(int j = i; j<arr.length; j++) {
      arr = swap(i,j,arr);
      permutations(arr, i +1);
      arr = swap(i,j,arr);
    }
  }
  
  static String[] swap(int i, int j, String[] arr) {
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }
}
