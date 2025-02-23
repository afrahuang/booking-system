package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Transactional
	public void saveOrder(Long userId, Long roomId, Date orderDate, Date checkingDate, Date checkoutDate) {
		Order order = new Order();
		order.setUserId(userId);
		order.setRoomId(roomId);
		order.setOrderDate(orderDate);
		order.setCheckingDate(checkingDate);
		order.setCheckoutDate(checkoutDate);
		orderRepository.save(order);
	}

	public List<Order> getOrderByCheckingDate(Date date) {
		return orderRepository.findOrderByCheckingDate(date);
	}

	public static final Date checkoutDate = new Date();

	public OrderRepository getOrderRepository() {
		return orderRepository;
	}

	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public static Date getCheckoutDate() {
		return checkoutDate;
	}

	public static String getOrderStatus() {
		return orderStatus;
	}

	public static final String orderStatus = "orderStatus";

	public static String getOrderId() {
		return orderStatus;
	}
}
