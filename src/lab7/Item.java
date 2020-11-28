package lab7;

public class Item {
	private ProductType product;
	private int quantity = 1 ;
	private String comment = "";
	
	public Item(ProductType product, int quantity, String comment) {
		this.product = product;
		if(quantity>0 && quantity<21) {
			this.quantity= quantity;
		}
		this.comment=comment;
	}
	
	public Item(ProductType product, int quantity) {
		this.product = product;
		if(quantity>0 && quantity<21) {
			this.quantity= quantity;
		}
	}
	
	public Item(ProductType product) {
		this.product=product;
	}
	
	public boolean addItem() {
		if (quantity<20) {
			quantity++;
			return true;
		}
		return false;
	}
	
	public boolean addItems(int number) {
		if(quantity + number < 21) {
			quantity = quantity + number;
			return true;
		}
		return false;
	}
	
	public boolean remove(int number) {
		if(quantity - number >0) {
			quantity = quantity - number;
			return true;
		}
		return false;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getTotalWeight() {
		return product.getWeight() * quantity;
	}

	@Override
	public String toString() {
		return "Item [product=" + product + ", quantity=" + quantity + ", comment=" + comment + "]";
	}
	
	public boolean equals(Item other) {
		if(quantity == other.quantity && product == other.product) return true;
		return false;
	}
	
	
	
}
