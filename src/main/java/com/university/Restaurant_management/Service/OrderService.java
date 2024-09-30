package com.university.Restaurant_management.Service;

import com.university.Restaurant_management.Entity.Orderr;
import com.university.Restaurant_management.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public  OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public  List<Orderr> getAllOrder(){
        return orderRepository.findAll();
    }


    public Orderr createOrder(Orderr order){
        return orderRepository.save(order);
    }


}
