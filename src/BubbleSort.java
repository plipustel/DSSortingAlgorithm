/**
 * @(#)BubbleSort Algorithm
 *
 *
 * @Author Plipus Tel <https://www.plipus.tel.com>
 * @Created May 20, 2012
 * @LastModified See in github log
 * 
 * @Defenition : > Bubble sort is a simple sorting algorithm that repeatedly
 *             steps through a list of elements, compares adjacent elements, and
 *             swaps them if they are in the wrong order. The process is
 *             repeated until the list is sorted.
 * 
 *             > Think about Tournament Competition,
 *             the best will compete with others until the best of the best is
 *             move to the top. This step is repeated until no more comparison.
 *             
 * @Complexity : O(1) best case
 * 			   : O(n^2) worst case
 * 
 */

public class BubbleSort {

	public static int[] bSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			/*
			 * -1, since will be compared j and j + 1, 1 the largest nums no longer compared.
			 */
			System.out.println("i= " + i);
			for (int j = 0; j < nums.length - 1; j++) {
				System.out.print(" j=" + j);
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
				for (int sorted : nums) {
					System.out.print(" " + sorted + ",");
				}
				System.out.println(" ");

			}
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort Algorithm O(n^2)");
		System.out.println("");

		int[] nums = { 12, 90, 14, 23, 48, 21 };
		System.out.println("Unsorted int of nums array:");
		System.out.print("[");
		for (int unsorted : nums) {
			System.out.print(unsorted + ",");
		}
		System.out.println("]");
		System.out.println("");

		bSort(nums);

		System.out.println("");
		System.out.println("Sorted int of nums array:");
		System.out.print("[");
		for (int sorted : nums) {
			System.out.print(sorted + ",");
		}
		System.out.print("]");
	}

}
