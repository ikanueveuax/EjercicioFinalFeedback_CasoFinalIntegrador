package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.pedidos.service;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.pedidos.model.Order;
import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.pedidos.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(Order order) {
        // Se puede agregar lógica adicional de negocio
        return orderRepository.save(order);
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
