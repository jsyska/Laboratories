package bluePrint;

public class SmallStock extends Stock {
	private Item[] items;
	private int maxItemNo;
	private int itemCount = 0;
	
	public SmallStock(int maxItemNo) {
		items = new Item[maxItemNo];
		this.maxItemNo=maxItemNo;
	}

	@Override
	public boolean addItem(Item it) {
		if(itemCount == maxItemNo)
			return false;
		items[itemCount] = it;
		itemCount++;
		return true;
	}

	@Override
	public int getItemCount() {
		return itemCount;
	}

	@Override
	public Item getItem(int index) {
		return items[index];
	}

}
