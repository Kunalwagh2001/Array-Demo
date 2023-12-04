import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergedTwoArrayInSorting {
public static void main(String[] args) {
	

	Integer arr1[] = {4,3,1,2,5};
	Integer arr2[] = {7,8,6,10,9};
	
	Set<Integer> arrylist1 = new HashSet<>(Arrays.asList(arr1));
	Set<Integer> arraylist2 = new HashSet<>(Arrays.asList(arr2));
	
	Set<Integer> MergedList = new HashSet<>();
	MergedList.addAll(arrylist1);
	MergedList.addAll(arraylist2);
	
	System.out.println("Merged List :"+MergedList);
}
}
