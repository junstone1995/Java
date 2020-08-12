package thisex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personLee = new Person();
		personLee.showInfo();
		
		Person personKim = new Person("Lee",20);
		personKim.showInfo();
		System.out.println(personLee);
		
		Person p =personLee.getSelf();
		System.out.println(p);
	}

}
