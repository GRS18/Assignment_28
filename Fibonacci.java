//Find the Fibonacci Series
//@GRS
package Assignment_28;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of Elements  in Fibonacci series: ");
		int n = in.nextInt();

		int[] arr = new int[n];

		arr[0] = 0;

		arr[1] = 1;

		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		System.out.println("Fibonacci Series:");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}
}
