package br.com.rafaelpereira.baozistore.repository;

import br.com.rafaelpereira.baozistore.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}