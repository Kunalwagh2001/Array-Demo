import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int arr[] = {12,10,47,35,19};
		
		Arrays.sort(arr);
		int length  = Array.getLength(arr);
		System.out.println("Length of Array : "+length);
		System.out.println("Ascending Order : "+Arrays.toString(arr));
		System.out.println("Second Largest Number is : "+arr[length-2]);
		
		
	}
}
