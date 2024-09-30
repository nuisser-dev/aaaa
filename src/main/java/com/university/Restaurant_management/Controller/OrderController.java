package com.university.Restaurant_management.Controller;

import com.university.Restaurant_management.Entity.Orderr;
import com.university.Restaurant_management.Repository.OrderRepository;
import com.university.Restaurant_management.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @PostMapping ("/AddOrder")
    public Orderr createOrder(@RequestBody Orderr order) {
        return orderRepository.save(order);
    }

    @GetMapping("/getallorder")
    public List<Orderr> getAllOrder(){
        List<Orderr>  order = orderService.getAllOrder();
        return order;
    }
    
    
 
}
