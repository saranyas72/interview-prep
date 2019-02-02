// 1) Given an input string, reverse the string. 
// Example: "This is a string" to "gnirts a is sihT" 

// 2) Given an input string, reverse the string word by word.
// Example: "This is a string" to "string a is This"'

// 2) Given an input string, reverse individual word.
// Example: "This is a string" to "sihT si a gnirts"'

// 4) Given a sorted array nums, remove the duplicates such that each element appear only once and return the new length.
// Example: [2,4,4,5,6,7,8,8,9,9,9,9,10] to [2,4,5,6,7,9,10]



import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {

    
  }
  public static String reverseStrByChar(String str)
  {
    char[] chars = str.toCharArray(); 
    int i=0;
    int j=chars.length-1;
    while(i<j)
    {
      char temp = chars[i];
      chars[i] = chars[j];
      chars[j] = temp;
      i++; j--;
    }
    return String.valueOf(chars);
  }
  
  public static String reverseStrByWord(String str)
  {
    String[] strArray=str.split(" "); 
    int i=0;
    int j=strArray.length-1;
    
    while(i<j) {
      String temp = strArray[i];
      strArray[i] = strArray[j];
      strArray[j] = temp;
      i++; j--;
    }
    return String.join(" ", strArray);
      
  }
  
  public static String reverseWordAndString(String str)
  {
    String[] strArray=str.split(" "); 
    int i=0;
    int j=strArray.length-1;
    
    while(i<j) {
      String temp = strArray[i];
      strArray[i] = strArray[j];
      strArray[j] = temp;
      i++; j--;
    }
        return reverseStrByChar(String.join(" ", strArray));   
  }
  public static void removeDuplicate(int[] arr) 
  {
    int i = 0;
    int j = i+1;
    int k=0;
    int[] uniqArray = new int[10];
    while(j<arr.length)
    {
      if(arr[i] == arr[j]) {
        i++;
        j++;
      } 
      else {
        uniqArray[k] = arr[i];
        uniqArray[k+1] = arr[j];
        i++;
        j++;
        k++;
      }
      
    }
    System.out.println(Arrays.toString(uniqArray));
    
    
  }
  
  public static void removeDuplicateTest(ArrayList<Integer> arr) 
  {
    int i = 0;
    int j = i + 1;
  
    while(j < arr.size()){
      if(arr.get(i) == arr.get(j)) {
        arr.remove(j);
      }
      else {
        i++;
        j++;
      }
    }
    System.out.println(arr.toString());
  }
  
}


// inp - 8 , 9, 9, 9, 9, 10
// i   - 0
// j . -     1


// inp - 8 , 9, 9, 9, 9, 10
// i   -     1
// j . -        2


// inp - 8 , 9, 9, 9, 10
// i   -     1
// j . -        2


// inp - 8 , 9, 9, 10
// i   -     1
// j . -        2

// inp - 8 , 9, 10
// i   -     1
// j . -        2

// inp - 8 , 9, 10
// i   -        1
// j . -           2
