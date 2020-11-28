package lab7;
import static lab7.ProductType.*;

public class Runner {

	public static void main(String[] args) {

		ProductType.testMe();
		
		System.out.println();
		System.out.println("Checking constructors");
		//create new Item with 3 arguments
		Item product1 = new Item(BREAD, 6, "Fresh bread");
		System.out.println(product1);
		
		//create new Item with 2 arguments
		Item product2 = new Item(MILK, 3);
		System.out.println(product2);
		
		//create new Item with 1 argument
		Item product3 = new Item(TEA);
		System.out.println(product3);
		
		//add method
		System.out.println();
		System.out.println("Adding one bread");
		product1.addItem();
		System.out.println(product1);
		
		//add items method
		System.out.println();
		System.out.println("Adding 5 milks");
		product2.addItems(5);
		System.out.println(product2);
		
		//exceeding the range
		System.out.println();
		System.out.println("Adding 13 milks to exceed the limit of 20 ");
		product2.addItems(13);
		System.out.println(product2);
		
		//remove method
		System.out.println();
		System.out.println("Removing 5 breads");
		product1.remove(5);
		System.out.println(product1);
		
		//below the range
		System.out.println();
		System.out.println("Removing 4 breads to exceed the range");
		product1.remove(4);
		System.out.println(product1);
		
		//get quantity method
		System.out.println();
		System.out.println("Get quantity of milks");
		System.out.println(product2.getQuantity());
		
		//get total weight 
		System.out.println();
		System.out.println("Get total weight");
		System.out.println("Bread: " + product1.getTotalWeight() );
		System.out.println("Milk: " + product2.getTotalWeight() );
		System.out.println("Tea: " + product3.getTotalWeight() );
	
		//equal method
		System.out.println();
		System.out.println("Equal method");
		
		Item product4 = new Item(BREAD,2,"Not fresh bread");
		System.out.println("Product4 equals product1: ");
		if(product1.equals(product4)) System.out.println("They are equal.");
		else System.out.println("They are not equal.");
		
		System.out.println("Product1 equals product3");
		if(product1.equals(product3)) System.out.println("They are equal.");
		else System.out.println("They are not equal.");
	}
}
