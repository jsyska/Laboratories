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
		if(comment != null) {
			this.comment=comment;
		}
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
		return addItems(1);
	}
	
	public boolean addItems(int number) {
		if(quantity + number < 21 && quantity + number > 0) {
			quantity = quantity + number;
			return true;
		}
		return false;
	}
	
	public boolean remove(int number) {
		return addItems(-number);
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public ProductType getProduct() {
		return product;
	}

	public double getTotalWeight() {
		return product.getWeight() * quantity;
	}

	@Override
	public String toString() {
		return "[product: " + product.show() + ", quantity: " + quantity + ", comment: \"" + comment + "\"]";
	}
	
//	public boolean equals(Item other) {
//		if(quantity == other.quantity && product == other.product) return true;
//		return false;
//	}
	
	public boolean equals(Object other) {
		if(other == this )
			return true;
		if(other == null)
			return false;
		if(getClass() != other.getClass())
			return false;
		Item item = (Item) other;
		if(item.getQuantity()!= getQuantity())
			return false;
		return product.equals(item.product);
	}
}
