package com.coderef.delivery.repository;

import com.coderef.delivery.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}
