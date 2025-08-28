package com.example.javaspringbootpro.dependencyinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.javaspringbootpro.dependencyinjection.entities.Order;
import com.example.javaspringbootpro.dependencyinjection.service.OrderService;
import com.example.javaspringbootpro.dependencyinjection.service.ShipmentService;

@SpringBootApplication
//@ComponentScan({"com.example.javaspringbootpro.dependencyinjection.entities","com.example.javaspringbootpro.dependencyinjection.service"})
public class Application implements CommandLineRunner{
	
	private OrderService OrderService;
	private ShipmentService ShipmentService;

	public Application(OrderService orderService,ShipmentService shipmentService) {
		OrderService = orderService;
		ShipmentService = shipmentService;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(2282, 800.0, 0.1);
		System.out.println(order.getCode());
		System.out.println(OrderService.total(order)+ShipmentService.shipment(order));	
	}

}
