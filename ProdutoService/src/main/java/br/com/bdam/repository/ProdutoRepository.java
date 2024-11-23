package br.com.bdam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bdam.entidades.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
