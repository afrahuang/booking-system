package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Room;
import com.example.demo.service.OrderService;
import com.example.demo.service.RoomService;

@Controller
@RequestMapping("/room")
public class RoomController {
	private final RoomService roomService;
	private final OrderService orderService;

	public RoomController(RoomService roomService, OrderService orderService) {
		this.roomService = roomService;
		this.orderService = orderService;
	}

	@GetMapping
	public String listRooms(Model model) {
		List<Room> room = roomService.getAllRooms();
		model.addAttribute("room", room);
		return "room-list";
	}

	@GetMapping("/search/{id}")
	public String searchRoom(@PathVariable("id") Long id, Model model) {
		Room room = roomService.searchRoom(id);
		model.addAttribute("room", room);
		System.out.println("查詢結果: " + room.getId());
		return "room-list :: roomList";
	}

	@GetMapping("/searchRooms/{capacity}")
	public String searchRooms(@PathVariable("capacity") Long capacity, Model model) {
		List<Room> room = roomService.getRoomOverCapacity(capacity);
		model.addAttribute("room", room);
		return "room-list";
	}

	@GetMapping("/orderForm")
	public String showOrderForm(@RequestParam Long id, Model model) {
		Room room = roomService.getRoomById(id);
		model.addAttribute(room);
		return "order-form";
	}

	@PostMapping("/submitOrder")
	public String submitOrder(@RequestParam Long userId,
			@RequestParam Long roomId,
			@RequestParam Date orderDate,
			@RequestParam Date checkingDate,
			@RequestParam Date checkoutDate) {

		orderService.saveOrder(userId, roomId, orderDate, checkingDate, checkoutDate);
		System.out.println("User ID: " + userId + "Room ID: " + roomId + " Order Date: " + orderDate
				+ " Check-in Date: " + checkingDate + "check-out Date " + checkingDate);
		return "redirect:/rooms";
	}

}
