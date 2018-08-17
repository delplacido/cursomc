package com.decioplacido.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decioplacido.cursomc.domain.Categoria;
import com.decioplacido.cursomc.repositories.CategoriaRepository;

@Service
public class CategorieService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
