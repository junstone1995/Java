package polymorphism;

class Animal {
	
	public void move(){
		System.out.println("동물이 움직입니다. ");
	}
} 

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다. ");
	}
} 
class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네발로 움직입니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
	
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
