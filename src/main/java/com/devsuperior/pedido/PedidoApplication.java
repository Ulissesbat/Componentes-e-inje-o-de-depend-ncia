package com.devsuperior.pedido;


import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.pedido.entities.Order;
import com.devsuperior.pedido.service.OrderServices;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {
	
	
	@Autowired
	private OrderServices orderServices;

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		

		int productCode = sc.nextInt();
		double basicValue = sc.nextDouble();
		double discount = sc.nextDouble();

		Order order = new Order(productCode, basicValue, discount);

		System.out.println("Pedido código " + productCode);
		System.out.println("Valor total: " + orderServices.total(order));
		
		
		sc.close();
	}

}
