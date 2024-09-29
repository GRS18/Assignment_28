/*  Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 10 which is completely divisible by sum of its digits.
Example: Suppose a number 24. Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by  sum of its digits or not.
 @GRS*/
package Assignment_28;

import java.util.Scanner;

public class HarshadNo {

	public static void main(String[] args) {
		int sum = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Number: ");
		int num = in.nextInt();
		int tempnum = num;
		while (num > 0) {
			sum = sum + (num % 10);
			num = num / 10;
		}
		if (tempnum % sum == 0)
			System.out.println("Enter Number is Harshad Number");
		else
			System.out.println("Enter Number is not Harshad Number");
	}

}
