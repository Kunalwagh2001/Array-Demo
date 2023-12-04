import java.util.Scanner;

public class FIndSpecificElement {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int num = sc.nextInt();
		
		boolean found = false;
		for(int i=0; i<array.length; i++) {
			if(array[i]==num) {
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.println("is present");
		}else {
			System.out.println("is not present");
		}
	}
}
