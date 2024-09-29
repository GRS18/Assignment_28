/*Java Program for Sorting first half in Ascending order and second half in Descending order
Example
Input: arr [6] = [1, 90, 34, 89, 7, 9]
Output: 1 7 9 90 89 34 program without using builtin function
 @GRS*/
package Assignment_28;

public class HalfSorting {

	public static void main(String[] args) {

		int arr[] = { 1, 90, 34, 89, 7, 9 };

		int mid = (arr.length) / 2;

		// Sort All Array Elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// Sort Elements Ascending  order after Middle
		for (int i = mid; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Sorted Array is");
		for (int a : arr) {
			System.out.println(a);
		}

	}
}
