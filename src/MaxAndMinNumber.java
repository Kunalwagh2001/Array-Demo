
public class MaxAndMinNumber {

	public static void main(String[] args) {
		int arr[] = {3,2,4,6,8,7,11,10};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}if(arr[i]>max) {
				max = arr[i];
			}
		}
	
		System.out.println("Maximum Number : "+max);
        System.out.println("Minimum Number : "+min );
        
        
        
        
        
        
        
	}
}
