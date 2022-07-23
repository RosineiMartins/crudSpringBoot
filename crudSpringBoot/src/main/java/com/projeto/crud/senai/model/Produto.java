package com.projeto.crud.senai.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	private String nome;
	private int quantidade;
	private BigDecimal preco;
	
	
	@Deprecated
	protected Produto() {}
	
	public Produto (String nome) {
		this.nome = nome;
		
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);	
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + "]";
	}
	
	
	
	public Long getId() {
		return id;
	}
		public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	
	
	
	
	
	
	
	
	
	

}
