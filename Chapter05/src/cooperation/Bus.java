package cooperation;

public class Bus {

		int busNumbers;
		int passengerCount;
		int money;
		
		public Bus(int busNumbers) {
			this.busNumbers = busNumbers;
		}
		
		public void take(int money) { //승차
			this.money += money;
			passengerCount++;
		}
		
		public void showBusInfo() {
			System.out.println(busNumbers + "번 버스의 승객은"+ passengerCount + "명이고 수입은"+money+"입니다.");
		}
		
}
