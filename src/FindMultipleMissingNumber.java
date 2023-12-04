import java.util.ArrayList;
import java.util.List;

public class FindMultipleMissingNumber {

	public static void main(String[] args) {
		int arr[] = {3,2,4,5,6,8,7,10};
		
		int max = arr[0];
		int min = arr[0];
		
	
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("Max = "+max);
		System.out.println("Min = "+min);
		
		 List<Integer> missingNumbers = new ArrayList<>();
		
		 for (int i = min + 1; i < max; i++) {
	            boolean found = false;
	            for (int num : arr) {
	                if (num == i) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                missingNumbers.add(i);
	            }
	        }

	        System.out.println("Missing Numbers: " + missingNumbers);
		
		
	}
}
