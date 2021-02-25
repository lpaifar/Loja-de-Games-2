package com.lojadegames2.lojadegames2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadegames2.lojadegames2.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>
{	
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase( String nomeCompleto);
}