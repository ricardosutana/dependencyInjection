package com.example.javaspringbootpro.dependencyinjection.service;

import org.springframework.stereotype.Service;

import com.example.javaspringbootpro.dependencyinjection.entities.Order;

@Service
public class ShipmentService {

    public double shipment(Order order){
        if(order.getBasicValue() > 0.0 && order.getBasicValue() < 100.0){
            return 20.0;
        }
        else if(order.getBasicValue() >= 100.0 && order.getBasicValue() <= 200.0){
            return 12.0;
        }
        else {
            return 0.0;
        }
     
        
    }
}
