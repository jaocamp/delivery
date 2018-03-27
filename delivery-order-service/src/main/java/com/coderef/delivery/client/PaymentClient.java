package com.coderef.delivery.client;

import org.springframework.cloud.netflix.feign.FeignClient;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "delivery-payment-service")
public interface PaymentClient {

	@RequestLine("GET /api/payments-status/{orderCode}")
	String checkStatus(@Param("orderCode") String orderCode);
}
