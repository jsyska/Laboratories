package lab8;

import lab7.Item;

public class ShoppingBag extends Bag{

	private boolean extremelyRobust;
	
	public ShoppingBag(boolean robustness){
		super(30);
		this.extremelyRobust = robustness;
	}

	public double getTotalWeight() {
		double totalWeight = 0;
		for(Item item: items) {
			totalWeight += item.getTotalWeight();
		}
		return totalWeight;
	}
	
	@Override
	public String toString() {
		return toString(", extremely robust: " + extremelyRobust);
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this )
			return true;
		if(other == null)
			return false;
		if(getClass() != other.getClass())
			return false;
		ShoppingBag shoppingBag = (ShoppingBag) other;
		if (shoppingBag.extremelyRobust != extremelyRobust)
			return false;
		return getItems().equals(shoppingBag.getItems());
	}
}
