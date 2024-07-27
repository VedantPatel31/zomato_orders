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

import com.entity.OrderDetails;
import com.repository.OrderDetailsRepo;

@RestController 
public class OrderDetailsController {
	@Autowired 
	OrderDetailsRepo repo;
	
	@PostMapping("/orderDetails")
	public OrderDetails orderDetails (@RequestBody OrderDetails details) {
		repo.save(details);
		return details;
	}

	
	@PutMapping("/orderDetails/update")
	public OrderDetails updateOrderDetails(@RequestBody OrderDetails details) {
		repo.save(details);
		return details;	
	}
	
	@DeleteMapping("/orderDetails/{orderDetailsId}")
	public OrderDetails updateOrder(@PathVariable("orderDetailsId") Integer orderDetailsId) {
		
		OrderDetails deletedOrderDetails = repo.findById(orderDetailsId).get();
		repo.deleteById(orderDetailsId);
		return deletedOrderDetails;	
	}
	
	@GetMapping("/orderDetails/all")
	public List<OrderDetails> allOrder() {
		List<OrderDetails> orderDetails = repo.findAll();
		return orderDetails;	
	}
}
