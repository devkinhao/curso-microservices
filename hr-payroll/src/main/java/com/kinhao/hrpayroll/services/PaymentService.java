package com.kinhao.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.kinhao.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 250.0, days);
	}
	

}
