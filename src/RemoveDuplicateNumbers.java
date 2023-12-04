import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		
		Integer arr[] = {1,2,4,5,7,4,9,8,6,2,1,3,8,7};
		
		System.out.println("Before Remove Duplicate Number : "+Arrays.toString(arr));
		
		Set<Integer> RemoveDuplicate = new HashSet<>(Arrays.asList(arr));
		System.out.println("After removing Duplicate Number : "+RemoveDuplicate);
		
	}
	
}
