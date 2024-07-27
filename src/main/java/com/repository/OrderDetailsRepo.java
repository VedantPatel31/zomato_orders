package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.OrderDetails;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Integer>{

}
