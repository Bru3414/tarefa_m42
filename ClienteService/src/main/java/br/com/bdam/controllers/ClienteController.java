package br.com.bdam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bdam.entidades.Cliente;
import br.com.bdam.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;

	@GetMapping
	private List<Cliente> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	private Cliente cadastrarCliente(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@PutMapping
	private void alterarCliente(@RequestBody Cliente cliente) {
		repository.save(cliente);
	}
}
