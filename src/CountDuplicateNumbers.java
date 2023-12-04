
public class CountDuplicateNumbers {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 1, 6, 7, 8, 9, 4, 7, 3, 9, 1, 7, 5, 3, 9};

        for(int i=0; i<arr.length; i++) {
        	int count =0;
        	for(int j=0; j<arr.length; j++) {
        		if(i!=j && arr[i]==arr[j]) {
        			count++;
        		}
        	}
        	if(count>0) {
        		System.out.println(arr[i]+" = "+count);
        	}
        }
		
		
		
	}
}
