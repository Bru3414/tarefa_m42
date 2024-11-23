package br.com.bdam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bdam.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
