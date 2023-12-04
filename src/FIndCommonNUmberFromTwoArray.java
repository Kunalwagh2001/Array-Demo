import java.util.HashSet;
import java.util.Set;

public class FIndCommonNUmberFromTwoArray {

	public static void main(String[] args) {
		
	    int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 4, 7, 8};
        
        Set<Integer> set1 = new HashSet<>();
        
        Set<Integer> set2 = new HashSet<>();
        
        for(int num : arr1) {
        	set1.add(num);
        }
        for(int num : arr2) {
        	if(set1.contains(num)) {
        		set2.add(num);
        		
        	}
        }
        
        System.out.println("Common number : "+set2);
	}
}
