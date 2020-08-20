package template;

public class MannualCar extends Car {

	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다. ");
		System.out.println("사람이 핸들을 조작합니다. ");
	}

	@Override
	public void stop() {
		System.out.println("시동을 끕니다. ");		
	}

}
