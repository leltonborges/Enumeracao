package Application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class main {

	public static void main(String[] args) {
		Order order1 = new Order(10, new Date(), OrderStatus.PROCESSING);
		
		System.out.println(order1.toString());
		
		//Inserindo atraves do Enum
		OrderStatus os1 = OrderStatus.DELIVERED;
		//Inserindo um enum por uma string
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
