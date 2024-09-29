//Count the number of occurrence of each element of an array.
//@GRS
package Assignment_28;

import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0;

		int arr[] = new int[5];

		System.out.println("Enter Elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println("Enter Element to find in Array: ");
		int num = in.nextInt();

		for (int a : arr) {
			if (num == a)
				count++;
		}
		System.out.println(num + " Occures in Array at " + count + " times");
	}

}
