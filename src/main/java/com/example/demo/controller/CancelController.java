package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import com.example.demo.service.RoomService;

import jakarta.persistence.Column;

@Controller
public class CancelController {

	@RequestMapping("room")
	public class RoomController {
		private final RoomService roomService;
		private final OrderService orderService;

		public RoomController(RoomService roomService, OrderService orderService) {
			this.roomService = roomService;
			this.orderService = orderService;
		}
	}

	@RequestMapping("/cancel")
	public String searchRooms(@PathVariable("date") Long capacity, Model model) {
		// List<Order> order = order.OrderRepository(order);
		// model.addAttribute("order", order);
		return "order-list";
	}

	// private final OrderService orderService;

	// public CancelController(OrderService orderService) {
	// this.orderService = orderService;
	// }

	@GetMapping("/searchOrders/{date}")
	public String searchRoom(@PathVariable("date") Date date, Model model) {
		// List<Order> order = orderService.getOrderByCheckinDate(date);
		// model.addAttribute("order", order);
		return "order-list";
	}

}
