package implementation;

import java.util.Arrays;

import algos.CountingSort;

public class MigratoryBirds {
	public static void main(String[] args) {
		int[]  input = { 3897, 98457, 1, 1, 2, 6, 24, 120, 72, 5040 };
		int[] output = CountingSort.countingSort(input);
		System.out.println(Arrays.toString(output));
	}
}
