/**
 * 
 */

/**
 * 
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] nums = { 12, 90, 14, 23, 48, 21, 10, 11, 15, 11, 33, 23, 23, 44, 42, 23}; // length 6/2 = 3;

		System.out.println("Unsorted nums array of integer:");
		for (int arr : nums) {
			System.out.print(arr + " ");
		}

		System.out.println("");
		mSortDivide(nums);

	}

	private static void mSortDivide(int[] nums) {
		// TODO Auto-generated method stub

		if (nums.length <= 1) {
			return;
		}

		int middle = nums.length / 2; // middle = 3

		int[] leftArray = new int[middle];
		int[] rigthArray = new int[nums.length - middle];

		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = nums[i];
		}

		// fill left array with array nums items
		for (int j = 0; j < rigthArray.length; j++) {
			rigthArray[j] = nums[middle++];
		}
	
		mSortDivide(leftArray); // call itselft recursive
		mSortDivide(rigthArray);
		
		
	}

}
