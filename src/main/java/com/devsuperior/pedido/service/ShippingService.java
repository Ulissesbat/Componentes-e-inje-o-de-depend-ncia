package com.devsuperior.pedido.service;

import org.springframework.stereotype.Service;

import com.devsuperior.pedido.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double basicValue = order.getBasic();

		if (basicValue < 100.0) {
			return 20.0;
		} else if (basicValue >= 100.0 && basicValue < 200.0) {
			return 12.0;
		} else {
			return 0.0;
		}
	}

}
