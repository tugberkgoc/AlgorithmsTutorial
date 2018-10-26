package com.tugberkgoc.algorithms.averybigsum;

import java.io.*;
import java.util.*;

public class Solution {

  // Complete the aVeryBigSum function below.
  static long aVeryBigSum(long[] ar) {
    long sum = 0;
    for(int i=0; i<ar.length; i++) {
      sum+=ar[i];
    }
    return sum;
  }

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/tugberkgoc/algorithms/averybigsum/output/output.txt"));

    final Scanner scanner = new Scanner(new File("src/com/tugberkgoc/algorithms/averybigsum/input/input.txt"));

    int arCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long[] ar = new long[arCount];

    String[] arItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < arCount; i++) {
      long arItem = Long.parseLong(arItems[i]);
      ar[i] = arItem;
    }

    long result = aVeryBigSum(ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
