// Find the Maximum Element and Average of Elements in an Array.
//@GRS
package Assignment_28;

import java.util.Scanner;

class Pmaxaverage {
	Scanner in = new Scanner(System.in);

	private int n;
	private int max;
	private int avg;
	private int sum;

	int arr[] = new int[100];

	public void getArray() {

		System.out.println("Enter number of Elements in Array: ");
		n = in.nextInt();

		System.out.println("Enter Array Elements: ");

		for (int i = 0; i <n; i++) {
			arr[i] = in.nextInt();
		}
	}

	public void maxArray() {
		for (int i = 0; i < n; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
	}

	public void avgArray() {
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		avg = sum / n;
	}

	public void show() {
		System.out.print("Array Elments are -  ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "  ");
		}

		System.out.println();

		System.out.println("Maximum Element in Array is: " + max);

		System.out.println("Average Element in Array is: " + avg);
	}

}

class MaxAverage {

	public static void main(String[] args) {

		Pmaxaverage pmaxaverage = new Pmaxaverage();

		pmaxaverage.getArray();
		pmaxaverage.maxArray();
		pmaxaverage.avgArray();
		pmaxaverage.show();
	}

}
