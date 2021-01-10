package com.tinuthas.dsdeliver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tinuthas.dsdeliver.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
