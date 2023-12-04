import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {
	public static void main(String[] args) {
		
		Integer arr1[] = {1,2,3,4,5};
		Integer arr2[] = {6,7,8,9,10};
		
		 List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr1));	
	     System.out.println("First ArrayList :"+arrayList);	 
	
	     List<Integer> arraylist1 = new ArrayList<>(Arrays.asList(arr2));
	     System.out.println("Second ArrayList :"+arraylist1);
	     
	     List<Integer> MergedList  = new ArrayList<>();
	     MergedList.addAll(arrayList);
	     MergedList.addAll(arraylist1);
	     
	     System.out.println("Merged List :"+MergedList);
	}

}
