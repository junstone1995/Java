package inheritance;

public class CustomerTest {

	public static void main(String[] args) {
			
		Customer customerLee = new Customer();
		customerLee.setCustomerName("홍길동");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		int priceLee = customerLee.calcPrice(10000);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("이준석");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다. ");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다. ");
		
		
		Customer customerNo = new VIPCustomer();
		customerNo.setCustomerID(10030);
		customerNo.setCustomerName("나폴리");
		customerNo.bonusPoint = 10000;
		int priceNo = customerNo.calcPrice(10000);
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + priceNo + "원 입니다. ");
	}

}
