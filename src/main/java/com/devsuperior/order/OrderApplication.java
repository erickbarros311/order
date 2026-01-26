package com.devsuperior.order;


import com.devsuperior.order.entities.Order;
import com.devsuperior.order.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderApplication implements CommandLineRunner {

	private OrderService orderService;

	public OrderApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		System.out.println("DESAFIO: Componentes e injeção de dependência");
		System.out.println("---------------------------------------------");
		Order order1 = new Order(1034,150.00,0.20);
		System.out.print("Order Code: " + order1.getCode());
		System.out.println(" - Total: " + orderService.total(order1));

		System.out.println("---------------------------------------------");

		Order order2 = new Order(2282,800.00,0.10);
		System.out.print("Order Code: " + order2.getCode());
		System.out.println(" - Total: " + orderService.total(order2));
		System.out.println("---------------------------------------");

		Order order3 = new Order(1309,95.90,0.0);
		System.out.print("Order Code: " + order3.getCode());
		System.out.println(" - Total: " + orderService.total(order3));
		System.out.println("---------------------------------------");
	}
}