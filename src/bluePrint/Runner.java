package bluePrint;

public class Runner {

	public static void main(String[] args) {
		HierarchyTag hTag1 = new HierarchyTag("living creature;mammals; human; student;");
		HierarchyTag hTag2 = new HierarchyTag("living creature;mammals; human; teacher;");
		HierarchyTag hTag3 = new HierarchyTag("living creature;birds;eagle");
		HierarchyTag hTag4 = new HierarchyTag("living creature;mammals; dog;");
		HierarchyTag hTag5 = new HierarchyTag(null);
		HierarchyTag hTag6 = new HierarchyTag("living creature; birds; ");
		HierarchyTag hTag7 = new HierarchyTag("living creature;mammals; human;");
		
		//HierarchyTag
		//toString
		System.out.println("===toString() method===");
		System.out.println("Expected: HierarchyTag: living creature;mammals; human; student;");
		System.out.println("Result: " + hTag1);
		System.out.println("Expected: null, result" + hTag5);
		
		//isMatching
		System.out.println();
		System.out.println("===isMatching() method===");
		System.out.println("Expected: true, result: " + hTag6.isMatching(hTag3));
		System.out.println("Expected: false, result: " +  hTag6.isMatching(hTag4));
		System.out.println("Expected: true, result: " + hTag7.isMatching(hTag1));
		System.out.println("Expected: true, result: " + hTag7.isMatching(hTag2));
		System.out.println("Expected: true, result: " + hTag7.isMatching(hTag4));
		System.out.println("Expected: false, result: " + hTag7.isMatching(hTag3));
		
		
		TermBagTag tTag1 = new TermBagTag("Interesting;to-do;must read; June ;");
		TermBagTag tTag2 = new TermBagTag("to-do; Monday 12; June ; buy it ;");
		TermBagTag tTag3 = new TermBagTag("buy it; color blue; Susan ;June ;");
		TermBagTag tTag4 = new TermBagTag("to-do;");
		TermBagTag tTag5 = new TermBagTag("buy it;");
		TermBagTag tTag6 = new TermBagTag("June; Susan;");
		
		//TermBagTag
		//toString
		System.out.println();
		System.out.println("===toString() method===");
		System.out.println("Expected: TermBagTag: Interesting;to-do;must read; June ;");
		System.out.println("Result: " + tTag1);
		
		//isMatching
		System.out.println();
		System.out.println("===isMatching() method===");
		System.out.println("Expected: true, result: " + tTag4.isMatching(tTag1));
		System.out.println("Expected: true, result: " + tTag4.isMatching(tTag2));
		System.out.println("Expected: true, result: " + tTag5.isMatching(tTag2));
		System.out.println("Expected: true, result: " + tTag5.isMatching(tTag3));
		System.out.println("Expected: true, result: " + tTag6.isMatching(tTag3));
		System.out.println("Expected: false, result: " + tTag6.isMatching(tTag2));
		
		//testing Item
		System.out.println();
		System.out.println("===Item test===");
		Item item1 = new Item("first", tTag4, hTag7);
	    Item item2 = new Item("second", "buy it; color blue; Susan ;June ;", "living creature;birds;eagle");
	    Item item3 = new Item("third", tTag1, hTag1);
	     
	    System.out.println(item1);
	    System.out.println(item2);
	    System.out.println(item3);
	     
	    //isMatching
	    System.out.println();
	    System.out.println("===isMatching method===");
	    System.out.println("Expected: true, result: " + item1.isMatching(item3));
	    System.out.println("Expected: false, result: " + item1.isMatching(item2));
	    System.out.println("Expected: false, result: " + item3.isMatching(item1));
	    
	    //SmallStock
	    
	    SmallStock stock = new SmallStock(5);
	    
	    //addItem
	    System.out.println();
	    System.out.println("===Add Item===");
	    System.out.println("Adding item1 to stock");
        if (stock.addItem(item1)){
            System.out.println("Success");
        }

        System.out.println("\nAdding item3 to stock");
        if (stock.addItem(item3)){
            System.out.println("Success");
        }

        System.out.println("\nNo. of items:");
        System.out.println(stock.getItemCount());

        System.out.println("\nAdding 4 more items");
        for(int i = 0; i < 4; i++) {
            if(stock.addItem(new Item("test", "test", "test"))){
                System.out.println("Success");
            } else {
                System.out.println("failed to add item");
            }
        }

        System.out.println("\nNo. of items:");
        System.out.println(stock.getItemCount());

        System.out.println("\nchecking item at index 1");
        System.out.println(stock.getItem(1));

	}

}
