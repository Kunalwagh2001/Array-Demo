import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7,4,9,8,6,2,1,3,8,7};
		
		System.out.println("Original List : "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(+arr[i]+" ");
					
					
				}
			}
		}
	}
	
}
