//Find the second maximum and second minimum Elements of an array.
//@GRS
package Assignment_28;

import java.util.Scanner;
import java.util.Arrays;
public class SecondElement {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int count = 0;

		int arr[] = new int[5];

		System.out.println("Enter Elements in Array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("Second Maximum Element in Array is: "+(arr[arr.length-2]));
		System.out.println("Second Minimum Element in Array is: "+arr[1]);
		
		
	}

}
