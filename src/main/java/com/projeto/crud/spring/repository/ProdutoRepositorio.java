package com.projeto.crud.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.crud.spring.model.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto,Long>{

}
