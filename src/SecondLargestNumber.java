
public class SecondLargestNumber {
	public static void main(String[] args) {

		int arr[] = { 12, 10, 47, 35, 19 };

		int largest = 0;
		int secondlargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		System.out.println("The second largest number = " + secondlargest);

	}
}