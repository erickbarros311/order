package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shippingCost(Order order) {
        double b = order.getBasic();
        double f = 0.0;

        if (b<100)
            f = 20.00;
        if (b>=100 && b<=200)
            f = 12.00;
        if (b>200)
            f = 0.0;

        return f;
    }
}