/**
 * 
 */

/**
 * 
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static int[] mSort(int[] nums) {
		return nums;

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}

		return n * factorial(n - 1);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 12, 90, 14, 23, 48, 21 };

		mSort(nums);

		boolean j = false;
		int i = 0;

		while (!j) {
			System.out.println(i);
			i++;

			if (i == 18) {
				j = true;
			}
		}

		System.out.println(factorial(5));

		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}
