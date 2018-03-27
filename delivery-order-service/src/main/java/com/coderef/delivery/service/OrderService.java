package com.coderef.delivery.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.coderef.delivery.client.PaymentClient;
import com.coderef.delivery.model.Order;
import com.coderef.delivery.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PaymentClient paymentClient;

    public Order save(@Validated Order order) {
        order.setCode( UUID.randomUUID().toString() );
        return orderRepository.save(order);
    }

    public Order findById(Integer id){
        return orderRepository.findOne(id);
    }

    public Iterable<Order> findAll(){
        return orderRepository.findAll();
    }

    public void delete(Integer id) {
        orderRepository.delete(id);
    }

    public String checkStatus(Integer id){
        Order order = orderRepository.findOne( id );
        return paymentClient.checkStatus( order.getCode() );
    }
}
