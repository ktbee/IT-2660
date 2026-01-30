//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Katie Broida
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] arr = {5, 9, 3, 12, 7, 3, 11, 5};
    int i = 0;

    while ( i < arr.length) {
      System.out.println(arr[i]);
      i++;
    }

    while ( i > 0) {
      i--;
      System.out.println(arr[i]);
    }

    System.out.println("First value in array: " + arr[0]);
    System.out.println("Last value in array: " + arr[arr.length - 1]);

  }

    // Call the methods created in Lab1.

}

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  public int max(int a, int b) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public int max(int nums[]) throws Exception {
    if (nums.length == 0) throw new Exception("Array is empty");
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return max;
  }

  public int min(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }

  public int min(int nums[]) throws Exception {
    if (nums.length == 0) throw new Exception("Array is empty");
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > min) {
        min = nums[i];
      }
    }
    return min;
  }

  public int sum(int nums[]) throws Exception {
    if (nums.length == 0) throw new Exception("Array is empty");

    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }

    return sum;
  }

  public int average(int nums[]) throws Exception {
    if (nums.length == 0) throw new Exception("Array is empty");

    int sum = 0;

    if (nums.length == 0) return 0;

    for (int num : nums) {
      sum += num;
    }

    return sum / nums.length;
  }
}
