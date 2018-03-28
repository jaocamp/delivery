package com.coderef.delivery.repository;

import org.springframework.data.repository.CrudRepository;

import com.coderef.delivery.model.CreditCard;
import com.coderef.delivery.model.Payment;

public interface CreditCardRepository extends CrudRepository<CreditCard, Integer> {

}
