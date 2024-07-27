package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Orders;
import com.repository.OrderRepo;

@RestController
public class OrderController {
	@Autowired
	OrderRepo repo;

	@PostMapping("/order")
	public Orders order(@RequestBody Orders order) {
		repo.save(order);
		return order;	
	}
	
	@PutMapping("/order/update")
	public Orders updateOrder(@RequestBody Orders order) {
		repo.save(order);
		return order;	
	}
	
	@DeleteMapping("/order/{orderId}")
	public Orders updateOrder(@PathVariable("orderId") Integer orderId) {
		Orders deletedOrder = repo.findById(orderId).get();
		repo.deleteById(orderId);
		return deletedOrder;	
	}
	
	@GetMapping("/order/all")
	public List<Orders> allOrder() {
		List<Orders> Orders = repo.findAll();
		return Orders;	
	}
}