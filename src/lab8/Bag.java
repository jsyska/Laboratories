package lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import lab7.Item;
import lab7.ProductType;

public class Bag {
	
	private final int capacity;
	private int minCapacity = 1;
	private int currentCapacity;
	protected List<Item> items = new ArrayList<>();
	
	
	public Bag(int bagCapacity) throws IllegalArgumentException {
		if(bagCapacity < this.minCapacity)
			throw new IllegalArgumentException("Invalid capacity: " + bagCapacity);
		this.capacity = bagCapacity;
		this.currentCapacity = bagCapacity;
	}
	
	public int getCapacity() {
		return capacity;
	}

	public List<Item> getItems() {
		return items;
	}

	public int getCurrentCapacity() {
		return currentCapacity;
	}

	public void removeAllItems() {
		items.clear();
		currentCapacity = capacity;
	}
	
	public boolean putIn(Item item) {
		if(currentCapacity - item.getQuantity() >= 0) {
			currentCapacity -= item.getQuantity();
			items.add(item);
			return true;
		}
		return false;
	}
	
	public boolean remove(ProductType product, int n) {
		if(n < 1)
			return false;
		
		Iterator<Item> i = items.iterator();
		while(i.hasNext()) {
			Item item = i.next();
			if(item.getProduct() == product) {
				if(item.getQuantity() >= n) {
					boolean toRemove = false;
					if(item.getQuantity() == n)
						toRemove = true;
					item.remove(n);
					currentCapacity =+ n;
					if(toRemove)
						i.remove();
					return true;
				}
				n -= item.getQuantity();
				i.remove();
			}
		}
		return false;	
	}
	
	public boolean remove(ProductType product) {
		return remove(product,capacity - currentCapacity);
	}

	public String toString(String str) {
		return "[capacity=" + capacity + ", currentCapacity=" + currentCapacity
				+ ", items=" + items + str + "]";
	}
	
	@Override
	public String toString() {
		return toString("");
	}
	
	
	@Override
	public boolean equals(Object other) {
		if(other == this )
			return true;
		if(other == null)
			return false;
		if(getClass() != other.getClass())
			return false;
		Bag bag = (Bag) other;
		if(bag.getCapacity() != getCapacity())
			return false;
		return getItems().equals(bag.getItems());
	}
	
}
