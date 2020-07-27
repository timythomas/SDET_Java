package sdetJava.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q10_RegarAndHeaps {

	public static void main(String args[]) {

		Q10_RegarAndHeaps q = new Q10_RegarAndHeaps();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of testcase");
		int tc = s.nextInt();
		for (int i = 1; i <= tc; i++) {

			List<List<Integer>> list = new ArrayList<>();
			List<List<Integer>> outputList = new ArrayList<>();
			int expectedSum = 0;
			int actualSum = 0;

			// array size, subset size, and m value
			int size = s.nextInt();
			int inputArray[] = new int[size];
			int subSize = s.nextInt();
			int m = s.nextInt();

			// array elements
			for (int j = 0; j < size; j++) {
				inputArray[j] = s.nextInt();
			}

			// sort the array
			Arrays.sort(inputArray);

			// get the subsets
			list = q.subsets(inputArray);

			// iterate and took only the subsetsize
			for (List<Integer> li : list) {
				if ((li.size()) == subSize) {
					outputList.add(li);
				}
			}
			// to get the actual sum
			for (int k : outputList.get(0))
				expectedSum = expectedSum + k;

			// to get the expected sum
			for (int k : outputList.get(m - 1))
				actualSum = actualSum + k;
			System.out.println("SubSets are: " + outputList);
			System.out.println("Output: " + (actualSum - expectedSum));
		}

		s.close();
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		subsetsHelper(list, new ArrayList<>(), nums, 0);
		return list;
	}

	private void subsetsHelper(List<List<Integer>> list, List<Integer> resultList, int[] nums, int start) {
		list.add(new ArrayList<>(resultList));
		for (int i = start; i < nums.length; i++) {
			// add element
			resultList.add(nums[i]);
			// Explore
			subsetsHelper(list, resultList, nums, i + 1);
			// remove
			resultList.remove(resultList.size() - 1);
		}
	}
}
