import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		
		Integer arr[] = {12,10,47,35,19};
		
		List<Integer> list = Arrays.asList(arr);
		
		
		Collections.reverse(list);

	   System.out.println(list);
	}
}
