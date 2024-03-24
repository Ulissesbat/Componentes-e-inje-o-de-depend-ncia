package com.devsuperior.pedido.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.pedido.entities.Order;

@Service
public class OrderServices {
	
	@Autowired
	private ShippingService shippingService;
	
	public double total(Order order) {
		
		double discountAmount = order.getBasic() * (order.getDiscount()/ 100.0);
		
		return order.getBasic() - discountAmount + shippingService.shipment(order);
	}

}
