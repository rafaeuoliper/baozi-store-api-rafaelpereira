package br.com.rafaelpereira.baozistore.repository;

import br.com.rafaelpereira.baozistore.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}