package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.pedidos.repository;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.pedidos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    // Métodos de consulta adicionales, si fueran necesarios.
}
