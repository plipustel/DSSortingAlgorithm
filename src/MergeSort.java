/**
 * MergeSort Algorithm - Divide & Conquer * 
 * @Complexity : 
 * - O(1) best case 
 * - O(log n) worst case
 *
 * @Coder Plipus Tel <https://www.plipus.tel.com>
 * @Created May 20, 2012
 * @LastModified See in github log
 * 
 * @Defenition : > Merge Sort algorithm is a divide and conquer algorithm which
 *             divides recursively the array until single pieces element, and
 *             then sort and merge each half until produce sorted array.
 * 
 * 
 * 
 */

public class MergeSort {

	public static void main(String[] args) {
		int[] nums = { 25, 10, 15, 60, 10, 80, 35 }; // length 6/2 = 3;

		System.out.println("Unsorted nums array of integer:");
		for (int arr : nums) {
			System.out.print(arr + " ");
		}

		System.out.println("");

		mSort(nums);
		System.out.println("Sorted nums array of integer:");
		for (int arr : nums) {
			System.out.print(arr + " ");
		}

	}

	private static void mSort(int[] nums) {

		/* DIVIDE */
		if (nums.length <= 1) {
			return;
		}

		int middle = nums.length / 2; // middle = 3

		int[] leftArray = new int[middle];
		int[] rightArray = new int[nums.length - middle];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = nums[i];
		}

		// fill left array with array nums items
		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = nums[middle++];
		}

		mSort(leftArray); // call itself recursively
		mSort(rightArray); // // call itself recursively

		int l = 0;
		int r = 0;
		int n = 0;

		/* Each block of left and right array are compared through recursively and independently */
		while (l < leftArray.length && r < rightArray.length) {
			if (leftArray[l] < rightArray[r]) {
				nums[n] = leftArray[l];
				l++;
				n++;
			} else {
				nums[n] = rightArray[r];
				r++;
				n++;
			}
		}

		/**
		 * Copy the left remaining item to the array Assume this r = 1, 5, 8 r = 2 4 n =
		 * [1, 2, 4, ?, ?] the remaining are 5, 8 when pointer index is i=1
		 */
		while (l < leftArray.length) {
			nums[n] = leftArray[l];
			l++;
			n++;
		}

		while (r < rightArray.length) {
			nums[n] = rightArray[r];
			r++;
			n++;
		}
	}

}
