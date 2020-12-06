package additionalTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Quiz {
	
	public static int sum(List<Integer> list) {
		int sum = 0;
		for ( Iterator iter = list.iterator(); iter.hasNext(); )   {
			int i = ((Integer)iter.next()).intValue();
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);
		intList.add(1);
		intList.add(7);
		
		System.out.println(sum(intList));
		
		
		int[] myArray= new int[] {1, 2,3,4, 5};
		List myList = Arrays.asList(myArray);
		
		}
}
