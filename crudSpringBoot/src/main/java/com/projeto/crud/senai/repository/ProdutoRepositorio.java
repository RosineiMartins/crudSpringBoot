package com.projeto.crud.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.crud.senai.model.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto,Long>{

}
