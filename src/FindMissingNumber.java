
public class FindMissingNumber {
public static void main(String[] args) {
	
	int arr[] = {1,3,4,5,6,7,8};
	
	int sum1 = 0;
	for(int i=0; i<arr.length; i++) {
		sum1 = sum1 + arr[i];
	}
	System.out.println("Sum of Elements :"+sum1);
	
	int sum2 = 0;
	for(int i=1; i<=8; i++) {
		sum2 = sum2 + i;
	}
	System.out.println("Sum of Range of Elements :"+sum2);
	System.out.println("Missing Number : "+(sum2-sum1));

}
	
}
