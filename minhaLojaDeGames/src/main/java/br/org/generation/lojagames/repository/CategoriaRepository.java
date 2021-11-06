package br.org.generation.lojagames.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojagames.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
