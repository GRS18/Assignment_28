/* Java program for rotation of elements of array- left and right. 
An array is said to be right rotated if all the selected elements were moved towards right by one position.*/
//@GRS
package Assignment_28;

class RightLeft {
	public void rightRotate(int arr[]) {
		int len = arr.length;
		int lasttemp = arr[len - 1];
		for (int i = len - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = lasttemp;
		System.out.print("Right rotate array with one place: ");
	}

	public void leftRotate(int arr1[]) {
		int firsttemp = arr1[0];
		for (int i = 0; i < (arr1.length) - 1; i++) {
			arr1[i] = arr1[i + 1];
		}
		arr1[(arr1.length) - 1] = firsttemp;
		System.out.print("Left rotate array with one place: ");
	}

	public void printRight(int arr[]) {
		for (int a : arr) {
			System.out.print(a + "  ");
		}
		System.out.println();
	}

	public void printLeft(int arr1[]) {
		for (int a : arr1) {
			System.out.print(a + "  ");
		}
	}
}

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 40, 50 };

		int arr1[] = { 11, 22, 33, 44, 55 };

		RightLeft rightleft = new RightLeft();

		rightleft.rightRotate(arr);
		rightleft.printRight(arr);

		rightleft.leftRotate(arr1);
		rightleft.printLeft(arr1);
	}

}
