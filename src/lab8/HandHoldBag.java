package lab8;

public class HandHoldBag extends Bag{

	private boolean premiumQuality;
	
	public HandHoldBag(boolean premiumQuality){
		super(5);
		this.premiumQuality = premiumQuality;
	}

	@Override
	public String toString() {
		return toString(", premium quality: " + premiumQuality) ;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == this  )
			return true;
		if(other == null)
			return false;
		if(getClass() != other.getClass())
			return false;
		HandHoldBag handHoldBag = (HandHoldBag) other;
		if(handHoldBag.premiumQuality != premiumQuality)
			return false;
		return getItems().equals(handHoldBag.getItems());
	}
}
