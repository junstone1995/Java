package cooperation;

public class Subway {
	
	int lineNumbers;
	int passengerCount;
	int money;
	
	public Subway(int lineNumbers) {
		this.lineNumbers = lineNumbers;
	}
	
	public void take(int money) { //승차
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumbers + "번 지하철의 승객은"+ passengerCount + "명이고 수입은"+money+"입니다.");
	}
	
}

