package com.example.javaspringbootpro.dependencyinjection.service;

import org.springframework.stereotype.Service;

import com.example.javaspringbootpro.dependencyinjection.entities.Order;

@Service
public class OrderService {
    
      
    public double total(Order order){

        return (order.getBasicValue()-(order.getBasicValue())*(order.getDiscount()/100));
    }
}
