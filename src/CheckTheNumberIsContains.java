
public class CheckTheNumberIsContains {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,5,7,3,9};
		int num =10;
		boolean IsPresent = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				IsPresent = true;
				break;
			}
		}
		if(IsPresent) {
			System.out.println(+num+ " Is present");
		}else {
			System.out.println(+num+ " Is not present");
		}
	}
}
