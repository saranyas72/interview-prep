
// 1. Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

// 2. Given an array of integers and a target sum, find all pairs that add up to the target sum. 

// input = [2, 5, 7, 9, 11]
// targetSum = 14
// output = [5,9]

/*
public class Solution {
 public static void main(String[] args)
 {
    for(int i = 1; i <= 100; i++)
    {
      if(i % 3 ==0 && i % 5 == 0)
        System.out.println("FizzBuzz \n");
      else if(i % 3 == 0)
        System.out.println("Fizz \n");
      else if(i % 5 == 0)
        System.out.println("Buzz \n");
      else
        System.out.println(i+"\n");      
    }
 }
}
*/

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

/*class Solution {
  public static void main(String[] args) {
    int[] numbers = {2, 4, 5, 7, 9, 11};
    int target = 14;
    for (int i=0; i<numbers.length-1 ; i++) {
      for(int j=0; j<numbers.length-1; j++) {
        if(numbers[i]+numbers[j] == target) {
            System.out.println("Sum of " +numbers[i]+ " and " +numbers[j]+ " is equal to "+ target);
        }
     }
    }
  }
}*/

class Solution {
 public static void main(String[] args) {
    int[] numbers = {2, 3, 5, 7, 9, 11};
    int target = 14;
   
    int i=0, j=numbers.length-1;
   
   while(i<j)
   {
     if(numbers[i]+numbers[j] < target)
            i++;
        else if(numbers[i]+numbers[j]>target)
            j--;
        else if(numbers[i]+numbers[j] == target){
            System.out.println("Sum of " +numbers[i]+ " and " +numbers[j]+ " is equal to "+ target);
     i++;j--;
    }
    
   }
 }
}
   
   /*
    for (int i=0; i<numbers.length-1; i++) {
      for(int j=i+1; (j<numbers.length-1) && i<j; j++) {
        if(numbers[i]+numbers[j] < target)
            i++;
        else if(numbers[i]+numbers[j]>target)
            j--;
        else if(numbers[i]+numbers[j] == target)
            System.out.println("Sum of " +numbers[i]+ " and " +numbers[j]+ " is equal to "+ target);
        else
          System.out.println("None of the integer pair add to target");   
    }
  }
 }
}*/
