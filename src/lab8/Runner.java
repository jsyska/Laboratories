package lab8;

import lab7.Item;
import lab7.ProductType;

public class Runner {

	public static void main(String[] args) {
		
		Item bread = new Item(ProductType.BREAD, 3);
		Item milk = new Item(ProductType.MILK, 2);
		Item butter = new Item(ProductType.BUTTER, 7);
		Item tea = new Item(ProductType.TEA, 18);
	
		
		//Test Constructors & toString() methods
		Bag bag = new Bag(40);
		HandHoldBag handHoldBag = new HandHoldBag(true);
		ShoppingBag shoppingBag = new ShoppingBag(true);
		
		try {
			Bag invalidBag = new Bag(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Bag");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Hand hold bag");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Shopping bag");
		System.out.println(shoppingBag);
		
		//Test putIn() method
		
		bag.putIn(bread);
		bag.putIn(tea);
		handHoldBag.putIn(milk);
		handHoldBag.putIn(bread);
		shoppingBag.putIn(butter);
		shoppingBag.putIn(tea);
		
		System.out.println();
		System.out.println("Expected: Bag with items: bread, tea");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Expected: Hand hold bag with items: milk, bread");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Expected: Shopping bag with items: butter, tea");
		System.out.println(shoppingBag);
		
		//Test putIn() overloading
		
		Item bread2 = new Item(ProductType.BREAD, 20, "bread2");
		
		
		bag.putIn(bread2);
		handHoldBag.putIn(bread2);
		shoppingBag.putIn(bread2);
		
		System.out.println();
		System.out.println("--Nothing has been added because of exceeded capacity--");
		
		System.out.println();
		System.out.println("Expected: Bag with items: bread, milk");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Expected: Hand hold bag with items: tea, bread");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Expected: Shopping bag with items: butter, milk");
		System.out.println(shoppingBag);
		
		
		//Test remove all items
		System.out.println();
		bag.removeAllItems();
		handHoldBag.removeAllItems();
		shoppingBag.removeAllItems();
		
		System.out.println();
		System.out.println("--All bags should be epmty--");
		
		System.out.println();
		System.out.println("Expected: empty bag");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Expected: empty hand hold bag");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Expected: empty shopping bag");
		System.out.println(shoppingBag);
		
		//remove method test
		
		System.out.println();
		System.out.println("Remove only items of type: milk from bags");
		
		Item milk1 = new Item(ProductType.MILK, 1);
		Item milk2 = new Item(ProductType.MILK, 2);
		Item milk3 = new Item(ProductType.MILK, 3);
		Item tea1 = new Item(ProductType.TEA, 2);
		Item tea2 = new Item(ProductType.TEA, 2);
		bag.putIn(milk1);
		bag.putIn(milk2);
		bag.putIn(tea1);
		handHoldBag.putIn(milk1);
		handHoldBag.putIn(milk2);
		handHoldBag.putIn(tea1);
		shoppingBag.putIn(milk1);
		shoppingBag.putIn(milk2);
		shoppingBag.putIn(tea1);
		
		System.out.println();
		System.out.println("--Before removing--");
		System.out.println();
		System.out.println("Expected: Bag with items: tea, milk");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Expected: Hand hold bag with items: tea, milk");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Expected: Shopping bag with items: tea, milk");
		System.out.println(shoppingBag);
		
		bag.remove(ProductType.MILK);
		handHoldBag.remove(ProductType.MILK);
		shoppingBag.remove(ProductType.MILK);
		
		System.out.println();
		System.out.println("--After removing--");
		
		System.out.println();
		System.out.println("Expected: bag with only tea");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Expected: hand hold bag with only tea");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Expected: shopping bag with only tea");
		System.out.println(shoppingBag);
		
		//remove(type, quantity) method test
		System.out.println();
		System.out.println("Add to all types of bags multiple items of the same product type and then remove given quantity");
		
		bag.removeAllItems();
		handHoldBag.removeAllItems();
		shoppingBag.removeAllItems();
		
		bag.putIn(milk1);
		bag.putIn(milk2);
		bag.putIn(milk3);
		bag.putIn(tea1);
		handHoldBag.putIn(milk1);
		handHoldBag.putIn(milk2);
		handHoldBag.putIn(milk3);
		handHoldBag.putIn(tea1);
		shoppingBag.putIn(milk1);
		shoppingBag.putIn(milk2);
		shoppingBag.putIn(milk3);
		shoppingBag.putIn(tea1);
		
		bag.remove(ProductType.MILK,3);
		handHoldBag.remove(ProductType.MILK,3);
		shoppingBag.remove(ProductType.MILK,3);
		
		System.out.println();
		System.out.println("--After removing 3 milks from every bag--");
		
		System.out.println();
		System.out.println("Expected: bag with tea and 3 milks");
		System.out.println(bag);
		
		System.out.println();
		System.out.println("Expected: hand hold bag witk only tea");

		System.out.println(handHoldBag);

		System.out.println();
		System.out.println("Expected: shopping bag with tea and 3 milks");
		System.out.println(shoppingBag);
		
		//equals method for every bag
		Bag bagToCompare1 = new Bag(40);
		Bag bagToCompare2 = new Bag(40);
		Bag bagToCompare3 = new Bag(20);
		
		HandHoldBag handBagToCompare1 = new HandHoldBag(true);
		HandHoldBag handBagToCompare2 = new HandHoldBag(true);
		HandHoldBag handBagToCompare3 = new HandHoldBag(false);
		
		ShoppingBag shoppingBag1 = new ShoppingBag(true);
		ShoppingBag shoppingBag2 = new ShoppingBag(true);
		ShoppingBag shoppingBag3 = new ShoppingBag(false);
		
		System.out.println();
		System.out.println("Method equals for bag");
		System.out.println("Expected: true, result: " + bagToCompare1.equals(bagToCompare2));
		System.out.println("Expected: false, result: " + bagToCompare1.equals(bagToCompare3));
		bagToCompare2.putIn(bread);
		System.out.println("Expected: false, result: " + bagToCompare1.equals(bagToCompare2));
		
		System.out.println();
		System.out.println("Method equals for hand hold bag");
		System.out.println("Expected: true, result: " + handBagToCompare1.equals(handBagToCompare2));
		System.out.println("Expected: false, result: " + handBagToCompare1.equals(handBagToCompare3));
		handBagToCompare2.putIn(bread);
		System.out.println("Expected: false, result: " + handBagToCompare1.equals(handBagToCompare2));
		
		System.out.println();
		System.out.println("Method equals for bag");
		System.out.println("Expected: true, result: " + shoppingBag1.equals(shoppingBag2));
		System.out.println("Expected: false, result: " + shoppingBag1.equals(shoppingBag3));
		shoppingBag2.putIn(bread);
		System.out.println("Expected: false, result: " + shoppingBag1.equals(shoppingBag2));
		
		//Total weight method for shopping bag
		System.out.println();
		System.out.println("Get total weight method for shopping bag");
		System.out.println("Expected: 36.6, result: " + shoppingBag.getTotalWeight());

		
	}

}
