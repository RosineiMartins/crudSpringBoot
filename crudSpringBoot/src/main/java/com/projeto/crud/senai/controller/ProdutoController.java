package com.projeto.crud.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.crud.senai.model.Produto;
import com.projeto.crud.senai.repository.ProdutoRepositorio;


@Controller
public class ProdutoController {
	
	private ProdutoRepositorio produtoRepo;
	public ProdutoController(ProdutoRepositorio produtoRepo) {
		this.produtoRepo = produtoRepo;
		
	}
	
	
	@GetMapping("/rh/produtos") 
	public String produtos(Model model) {
		model.addAttribute("listaProdutos", produtoRepo.findAll());
		return "rh/produtos/index";
		
		
	}
	
	@GetMapping("rh/produtos/nova")
	public String novoProduto(@ModelAttribute("produto") Produto produto) {
		
		return "rh/produtos/form";
		
		
	}
	@GetMapping("/rh/produtos/{id}")	
	public String alterarPessoa(@PathVariable("id") long id, Model model) {
		java.util.Optional<Produto> produtoOpt = produtoRepo.findById(id);
		if (produtoOpt.isEmpty()) {
			throw new IllegalArgumentException("Produto invalido");
		}
		
		model.addAttribute("produto", produtoOpt.get());
		return "rh/produtos/form";
	}
	
	@PostMapping("/rh/produtos/salvar")
	public String salvarProduto(@ModelAttribute("produto") Produto produto) {
		 
		produtoRepo.save(produto);
		return "redirect:/rh/produtos";
		
	}
	
	@GetMapping("/rh/produtos/excluir/{id}")
	public String excluirPessoa(@PathVariable("id") long id) {
		java.util.Optional<Produto> produtoOpt = produtoRepo.findById(id);
		if (produtoOpt.isEmpty()) {
			throw new IllegalArgumentException("Produto invalido");
		}
		
		produtoRepo.delete(produtoOpt.get());
		return "redirect:/rh/produtos";
		
		
		
	}
	 
	
	

}
