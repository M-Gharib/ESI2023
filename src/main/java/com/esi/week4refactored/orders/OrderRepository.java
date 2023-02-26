package com.esi.week4refactored.orders;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, String>{
    
    public List<Order> findByProductId(String productId);
}
