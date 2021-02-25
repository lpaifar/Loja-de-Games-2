package com.lojadegames2.lojadegames2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames2.lojadegames2.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> 
{
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}