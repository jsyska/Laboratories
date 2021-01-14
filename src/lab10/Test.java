package lab10;

public class Test {

	public static void main(String[] args) throws Exception {
		Person person1 = new Person("Jakub",2001,"RSsss");
		person1.addMovementType(MovementType.RUN);
		person1.addMovementType(MovementType.SWIM);
		Person person2 = new Person("Jon",1997,"WSW");
		person2.addMovementType(MovementType.WALK);
		person2.addMovementType(MovementType.SWIM);
		Person person3 = new Person("Mike",1980,"RW");
		person3.addMovementType(MovementType.JUMP);
		person3.addMovementType(MovementType.CRAWL);
		Person person4 = new Person("Bob",1991,"WW");
		person4.addMovementType(MovementType.CRAWL);
		person4.addMovementType(MovementType.SWIM);
		person4.addMovementType(MovementType.RUN);
		person4.addMovementType(MovementType.WALK);
		Person person5 = new Person("Emma",2000,"RRSS");
		person5.addMovementType(MovementType.WALK);
		person5.addMovementType(MovementType.RUN);
		
		System.out.println("Person1 age: "+ person1.getAge());
		System.out.println(person1);
		person1.addMovementType(MovementType.RUN);
		person1.addMovementType(MovementType.CRAWL);
		System.out.println(person1);
		System.out.println("Person2 name: "+ person2.getName());
		System.out.println("Expected true, result " + person1.canRead());
		System.out.println("Expected true, result " + person3.canRead());
		System.out.println("Expected true, result " + person2.canWrite());
		System.out.println("Expected false, result " + person5.canWrite());
		
		
		Pet pet1 = new Pet("Bella", 2019, true, MovementType.RUN);
		Pet pet2 = new Pet("Sharky", 2019, true, MovementType.JUMP);
		Pet pet3 = new Pet("Fafik", 2019, true, MovementType.CRAWL);
		Pet pet4 = new Pet("Filemon", 2019, true, MovementType.WALK);
		Pet pet5 = new Pet("Fifi", 2019, true, MovementType.SWIM);
		
		System.out.println(pet1);
		
		System.out.println("Pet1 age: " + pet1.getAge());
		System.out.println("Pet2 name: " + pet2.getName());
		
		LivingCreature[] creatures = new LivingCreature[] {person1,person2,person3,person4,person5,pet1,pet2,pet3,pet4,pet5};
		int averageAgePeople = 0;
		int averageAgePets = 0;
		for(LivingCreature lc: creatures) {
			if (lc instanceof Person)
				averageAgePeople += lc.getAge();
			else
				averageAgePets += lc.getAge();
		}
		System.out.println();
		System.out.println("Calculate average age");
		
		System.out.println("Average age of people: " + averageAgePeople/5);
		System.out.println("Average age of pets: " + averageAgePets/5);
		
	}

	
	
	public static int calculateAverageAgePeople(LivingCreature[] creatures, int quantity) {
		int averageAgePeople = 0;
		for(LivingCreature lc: creatures) {
			if (lc instanceof Person)
				averageAgePeople += lc.getAge();
		}
		return averageAgePeople/quantity;
	}
	
	public static int calculateAverageAgePets(LivingCreature[] creatures, int quantity) {
		int averageAgePets = 0;
		for(LivingCreature lc: creatures) {
			if (lc instanceof Pet)
				averageAgePets += lc.getAge();
		}
		return averageAgePets/quantity;
	}


}
