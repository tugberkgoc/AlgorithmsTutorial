package com.tugberkgoc.algorithms.diagonaldifference;

import java.io.*;
import java.util.*;

public class Solution {

  // Complete the diagonalDifference function below.
  static int diagonalDifference(int[][] arr) {
    int righttoleftdia = 0;
    int lefttorightdia = 0;

    for(int i=0; i<arr[0].length; i++) {
      for(int j=0; j<arr[0].length; j++) {
        if(i == j) {
          righttoleftdia+=arr[i][j];
        }
        if(i + j - arr[0].length == -1) {
          lefttorightdia+=arr[i][j];
        }
      }
    }

    int absoluteValue;

    if(righttoleftdia > lefttorightdia) {
      absoluteValue = righttoleftdia - lefttorightdia;
    } else {
      absoluteValue = lefttorightdia - righttoleftdia;
    }

    return absoluteValue;
  }

  // private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/tugberkgoc/algorithms/diagonaldifference/output/output00.txt"));

    final Scanner scanner = new Scanner(new File("src/com/tugberkgoc/algorithms/diagonaldifference/input/input00.txt"));

    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[][] arr = new int[n][n];

    for (int i = 0; i < n; i++) {
      String[] arrRowItems = scanner.nextLine().split(" ");
      scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

      for (int j = 0; j < n; j++) {
        int arrItem = Integer.parseInt(arrRowItems[j]);
        arr[i][j] = arrItem;
      }
    }

    int result = diagonalDifference(arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
