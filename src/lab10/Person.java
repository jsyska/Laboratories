package lab10;

public class Person extends LivingCreature implements MentalSkills {
	
	private String skills = "";
	private MovementType moves[] = new MovementType[MovementType.values().length];
	private int index = 0;
	
	public Person(String id, int year, String skills) {
		super(id,year);
		if (skills != null) {
			if(skills.contains("r") || skills.contains("R"))
				this.skills +="R";
			if(skills.contains("w") || skills.contains("W"))
				this.skills+= "W";
			if(skills.contains("s") || skills.contains("S"))
				this.skills+= "S";
		}
	}
	
	public void addMovementType(MovementType mt) {
		boolean isRecorded = false;
		for(MovementType movementType: moves) {
			if(movementType == mt) {
				isRecorded = true;
				break;
			}
		} 
		if(!isRecorded) {
			moves[index++] = mt;
		}
			
		
	}

	@Override
	public boolean canRead() {
		return skills.contains("R");
	}

	@Override
	public boolean canWrite() {
		return skills.contains("W");
	}

	@Override
	public boolean canSign() {
		return skills.contains("S");
	}
	
	private String getSkills() {
		String result = "";
		if(canRead())
			result+= "read, ";
		if(canWrite())
			result += "write, ";
		if(canSign())
			result += "sing, ";
		
		if(result.endsWith(", "))
			result = result.substring(0, result.length()-2);
		return result;
	}
	
	private String getMoves() {
		String result ="";
		for(MovementType mt: moves){
			if(mt!=null)
				result += String.valueOf(mt) + ", ";
		}
		
		if(result.endsWith(", "))
			result = result.substring(0, result.length()-2);
		
		return result;
	}

	@Override
	public String toString() {
		return "Person; Name: " + getName() + ", Age: " + getAge() 
		+ ", Skills: " + getSkills() + ", Moves: " + getMoves();
	}
	
}
