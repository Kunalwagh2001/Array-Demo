
public class FindTheSumOfTwoNumber {

	public static void main(String[] args) {
		
		int arr[] = {2,5,4,3,1,7,8,9};
		
		int num = 10;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+0; j<arr.length; j++) {
				if(arr[i]+arr[j]==num) {
					System.out.println(arr[i]+"+"+arr[j]+"="+num);
				}
			}
		}
		
	}
}
