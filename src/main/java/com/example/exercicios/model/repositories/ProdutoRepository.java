package com.example.exercicios.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.exercicios.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	// Consultar por convenções
	/*
	 * findByNommeContaining
	 * findByNomeContains
	 * findByNomeIsContaining
	 * findByNomeNotContaining
	 * 
	 * findByNomeStartsWith
	 * findByNomeEndsWith
	 */
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
