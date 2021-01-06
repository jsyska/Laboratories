package lab7;
import static lab7.ProductType.*;

public class Runner {

	public static void main(String[] args) {

		ProductType.testMe();
		
		System.out.println();
		System.out.println("Checking constructors");
		//create new Item with 3 arguments
		Item product1 = new Item(BREAD, 6, "Fresh bread");
		System.out.println("Expected: [product: bread [3.5], quantity: 6, comment: \"Fresh bread\"], result: " + product1);
		
		//create new Item with 2 arguments
		Item product2 = new Item(MILK, 3);
		System.out.println("Expected: [product: milk [2.2], quantity: 3, comment: \"\"], result: " + product2);
		
		//create new Item with 1 argument
		Item product3 = new Item(TEA);
		System.out.println("Expected: [product: tea [15.0], quantity: 1, comment: \"\"], result: " + product3);
		
		//add method
		System.out.println();
		System.out.println("Adding one bread");
		product1.addItem();
		System.out.println("Expected: [product: bread [3.5], quantity: 7, comment: \"Fresh bread\"], result: " + product1);
		
		//add items method
		System.out.println();
		System.out.println("Adding 5 milks");
		product2.addItems(5);
		System.out.println("Expected: [product: milk [2.2], quantity: 8, comment: \"\"], result: " + product2);
		
		//exceeding the range
		System.out.println();
		System.out.println("Adding 13 milks to exceed the limit of 20 ");
		product2.addItems(13);
		System.out.println("Expected: [product: milk [2.2], quantity: 8, comment: \"\"], result: " + product2);
		
		//remove method
		System.out.println();
		System.out.println("Removing 5 breads");
		product1.remove(5);
		System.out.println("Expected: [product: bread [3.5], quantity: 2, comment: \"Fresh bread\"], result: " + product1);
		
		//below the range
		System.out.println();
		System.out.println("Removing 4 breads to exceed the range");
		product1.remove(4);
		System.out.println("Expected: [product: bread [3.5], quantity: 2, comment: \"Fresh bread\"], result: " + product1);
		
		//get quantity method
		System.out.println();
		System.out.println("Get quantity of milks");
		System.out.println("Expected: 8, result: " + product2.getQuantity());
		
		//get total weight 
		System.out.println();
		System.out.println("Get total weight");
		System.out.println("Bread - expected: 7.0, result: " + product1.getTotalWeight() );
		System.out.println("Milk - expected: 17.6, result: " + product2.getTotalWeight() );
		System.out.println("Tea - expected: 15.0, result: " + product3.getTotalWeight() );
	
		//equal method
		System.out.println();
		System.out.println("Equal method");
		
		Item product4 = new Item(BREAD,2,"Not fresh bread");
		System.out.println("Product4 equals product1: ");
		System.out.println("Expected: true, result: " + product1.equals(product4));
//		if(product1.equals(product4)) System.out.println("They are equal.");
//		else System.out.println("They are not equal.");
		
		System.out.println("Product1 equals product3");
		System.out.println("Expected: false, result: " + product1.equals(product3));
//		if(product1.equals(product3)) System.out.println("They are equal.");
//		else System.out.println("They are not equal.");
	}
}
