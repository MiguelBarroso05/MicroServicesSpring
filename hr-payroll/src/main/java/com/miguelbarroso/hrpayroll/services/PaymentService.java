package com.miguelbarroso.hrpayroll.services;

import com.miguelbarroso.hrpayroll.entities.Payment;
import com.miguelbarroso.hrpayroll.entities.Worker;
import com.miguelbarroso.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;


    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findByID(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
