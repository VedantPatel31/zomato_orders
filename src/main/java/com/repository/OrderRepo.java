package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Orders;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}
