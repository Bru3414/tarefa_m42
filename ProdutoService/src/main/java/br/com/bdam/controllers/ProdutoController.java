package br.com.bdam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bdam.entidades.Produto;
import br.com.bdam.repository.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;

	@GetMapping
	private List<Produto> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	private Produto cadastrarCliente(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@PutMapping
	private void alterarCliente(@RequestBody Produto produto) {
		repository.save(produto);
	}
}
