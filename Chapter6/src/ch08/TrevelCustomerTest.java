package ch08;

import java.util.ArrayList;
import java.util.List;

public class TrevelCustomerTest {

	public static void main(String[] args) {

		
		TravelCustomer customerLee  = new TravelCustomer("이순신",40,100);
		TravelCustomer customerKim  = new TravelCustomer("김유신",20,100);
		TravelCustomer customerHong  = new TravelCustomer("홍길동",13,50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHing);
		
		System.out.println("고객 명단");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("여행 비용");
		customerList.stream().mapToInt(c->c.getPrice()).sum());
		
	}

}
