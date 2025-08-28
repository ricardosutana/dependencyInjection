package com.example.javaspringbootpro.dependencyinjection.service;

import org.springframework.stereotype.Service;

import com.example.javaspringbootpro.dependencyinjection.entities.Order;

@Service
public class OrderService {
    
      
    public double total(Order order){
        /*
         * metodo total ja poderia imprimir o valor total do pedido
         * e o codigo do pedido
         * System.out.println("Codigo da ordem: " + order.getCode());
         * System.out.println("Total do pedido: " + total(order));
         */
        return (order.getBasicValue()-(order.getBasicValue())*(order.getDiscount()));
    }
}
