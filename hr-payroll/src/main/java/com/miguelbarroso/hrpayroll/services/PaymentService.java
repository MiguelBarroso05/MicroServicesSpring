package com.miguelbarroso.hrpayroll.services;

import com.miguelbarroso.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.00, days);
    }
}
