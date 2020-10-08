package com.gamestore.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamestore.loja.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	
}
