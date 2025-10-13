package com.example.pedidos.repository;

import com.example.pedidos.model.Pedido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByClienteId(Long clienteId);

    Long countByClienteId(Long cliente_id);
}
