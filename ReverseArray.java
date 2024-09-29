//Reverse a given Array and print.
//@GRS
package Assignment_28;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int arr[] = new int[5];

		System.out.println("Enter Elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		{
			System.out.println("Elements in Arrya is: ");
			for (int a : arr) {
				System.out.print(a + "  ");
			}

			System.out.println();
			System.out.println("Reverse Elements in Arrya is: ");
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i] + "  ");
			}
		}

	}

}
