package com.tugberkgoc.algorithms.simplearraysum;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	/*
	 * Complete the simpleArraySum function below.
	 */
	static int simpleArraySum(int[] ar) {
		int temp = 0;
		for(int i=0; i < ar.length; i++) {
			temp += ar[i];
		}
		return temp;
	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/tugberkgoc/QA002SimpleArraySum/output/output.txt")); // System.getenv("OUTPUT_PATH")

		final Scanner scanner = new Scanner(new File("src/com/tugberkgoc/QA002SimpleArraySum/input/input.txt"));

		int arCount = Integer.parseInt(scanner.nextLine().trim());

		int[] ar = new int[arCount];

		String[] arItems = scanner.nextLine().split(" ");

		for (int arItr = 0; arItr < arCount; arItr++) {
			int arItem = Integer.parseInt(arItems[arItr].trim());
			ar[arItr] = arItem;
		}

		int result = simpleArraySum(ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

	}

}
