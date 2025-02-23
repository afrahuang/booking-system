package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "project_order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	@Column(nullable = false)
	private Long userId;

	@Column(nullable = false)
	private Long roomId;

	@Column(nullable = false)
	private Date orderDate;

	@Column(nullable = false)
	private Date checkingDate;

	@Column(nullable = false)
	private Date checkoutDate;

	@Column(nullable = false)
	private String orderStatus;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getCheckingDate() {
		return checkingDate;
	}

	public void setCheckingDate(Date checkingDate) {
		this.checkingDate = checkingDate;
	}

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
