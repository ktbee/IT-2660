import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      long startTime;
      long endTime;

      System.out.println("Unsorted Array ---------------------------------------------------");
      ArrayList<Integer> integerList = Lab4.getList();
      Lab4.outputList(integerList);

      System.out.println("\n\nBubble sort results ----------------------------------------------");
      startTime = System.nanoTime();
      ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(integerList);
      endTime = System.nanoTime();
      long bubbleSortTime = endTime - startTime;
      Lab4.outputList(bubbleSortedList);

      System.out.println("\n\nInsertion sort results -------------------------------------------");
      startTime = System.nanoTime();
      ArrayList<Integer> insertionSortedList = Lab4.insertionSort(integerList);
      endTime = System.nanoTime();
      long insertionSortTime = endTime - startTime;
      Lab4.outputList(insertionSortedList);

      System.out.println("\n\nTime results -------------------------------------------");
      System.out.println("Bubble sort time: " + bubbleSortTime + " nanoseconds");
      System.out.println("Insertion sort time: " + insertionSortTime + " nanoseconds");
    }
}

class Lab4 {
  public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
    // Step 1 - Implement insertion sort algorithm here
    for (int i = 1; i < integerList.size(); i++) {
        int currentVal = integerList.get(i);
        int leftIndex = i - 1;

        // Shift values right if less than currentVal
        while (leftIndex >= 0 && integerList.get(leftIndex) > currentVal) {
          integerList.set(leftIndex + 1, integerList.get(leftIndex));
          leftIndex--;
        }

        // No values left that are less than currentVal, found its correct position for insert
        integerList.set(leftIndex + 1, currentVal);
    }

    return integerList;
  }

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
    // Step 2 - Implement the bubble sort algorithm here
    boolean didSwap = true;

    // Sort until no swaps are needed in an iteration
    while (didSwap) {
      didSwap = false;
      for (int i = 0; i < integerList.size() - 1; i++) {
        // Check if number on the left is larger than the number on the right
        // If so, swap them
        if (integerList.get(i) > integerList.get(i + 1)) {
          int temp = integerList.get(i);
          integerList.set(i, integerList.get(i + 1));
          integerList.set(i + 1, temp);
          didSwap = true;
        }
      }
    }

    return integerList;
  }

  public static ArrayList<Integer> getList() {
    ArrayList<Integer> integerList = new ArrayList<>();
    String line;
    try (BufferedReader br = new BufferedReader(new FileReader("lab4/integers.txt"))) {
        while ((line = br.readLine()) != null) {
            integerList.add(Integer.parseInt(line));
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return integerList;
  }

  public static void outputList(ArrayList<Integer> integerList) {
    for (int i = 0; i < integerList.size(); i++) {
        System.out.print(integerList.get(i) + " ");
    }
  }
}
