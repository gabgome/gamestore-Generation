package com.gamestore.loja.repository;

import java.util.List;

import com.gamestore.loja.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByNomeCategContainingIgnoreCase (String nomecateg);

}
