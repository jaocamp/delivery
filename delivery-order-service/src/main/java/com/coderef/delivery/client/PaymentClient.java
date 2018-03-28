package com.coderef.delivery.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import feign.Param;
import feign.RequestLine;

//@FeignClient(name = "delivery-payments-service")
public interface PaymentClient {

//	@GetMapping("/api/payments-status/{orderCode}")
	String checkStatus(@Param("orderCode") String orderCode);
}
