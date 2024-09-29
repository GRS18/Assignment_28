//ava program to count numbers of even and odd elements in an array
//@Grs
package Assignment_28;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int counteven = 0;
		int countodd = 0;

		Scanner in = new Scanner(System.in);

		int arr[] = new int[5];
		System.out.println("Enter Elements in Array: ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();

			if (arr[i] % 2 == 0)
				counteven++;
			else
				countodd++;
		}

		System.out.print("Array is: ");
		for (int a : arr) {
			System.out.print(a + "  ");
		}
		System.out.println();
		System.out.println("Even Elements in Array are: " + counteven);
		System.out.println("Odd Elements in Array are: " + countodd);
	}

}
