package com.test.Ecommerce.Service;

import com.test.Ecommerce.Model.Orders;
import com.test.Ecommerce.Repos.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public Optional<Orders> getOrderById(Integer id){
        return iOrderRepo.findById(id);
    }

    public String placeAnOrder(Orders order){
        iOrderRepo.save(order);
        return "Order Placed :) !";
    }

    public List<Orders> getAllOrders(){
        return (List<Orders>) iOrderRepo.findAll();
    }

    public String deleteOrderById(Integer id){
        iOrderRepo.deleteById(id);
        return "Order Cancelled :( !";
    }
}
