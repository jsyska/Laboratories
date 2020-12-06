package additionalTasks;

import java.util.TreeSet;

public class Drink implements Comparable{
	public String name;
	public int compareTo(Object o) {
		return 0;
	}
	
	public static void main(String[] args) {
		Drink one = new Drink();
		Drink two = new Drink();
		one.name= "Coffee";
		two.name= "Tea";
		TreeSet<Drink> set = new TreeSet();
		set.add(one);
		set.add(two);
		
		for(Drink d: set) {
			System.out.println(d.name);
		}
	}
	
}

 
