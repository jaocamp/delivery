package com.coderef.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.coderef.delivery.model.Payment;

public interface PaymentRepository  extends CrudRepository<Payment, Integer> {

}
