package br.com.rafaelpereira.baozistore.repository;

import br.com.rafaelpereira.baozistore.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}