package lab10;

public class Pet extends LivingCreature{
	private MovementType mt;
	private boolean isDog;
	
	public Pet(String id, int year, boolean isDog, MovementType mt) throws Exception{
		super(id,year);
		this.isDog = isDog;
		if (mt != null)
			this.mt = mt;
		else
			throw new Exception("Movement Type was null");
	}


	@Override
	public String toString() {
		return "Pet; " + getName() +", Age: " + getAge() + ", is Dog: " 
				+ isDog + ", Movement Type: " + mt; 
	}}
