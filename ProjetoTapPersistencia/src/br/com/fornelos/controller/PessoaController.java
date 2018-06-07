package br.com.fornelos.controller;

import java.util.List;

import br.com.fornelos.dao.PessoaDao;
import br.com.fornelos.entities.Pessoa;
import br.com.fornelos.excecoes.ObjetoJaCadastradoException;

public class PessoaController {
	
	
public PessoaController() {
	
}

public void inserir(Pessoa pessoa) throws Exception,  ObjetoJaCadastradoException{
	 PessoaDao p = new PessoaDao();
	if (p.consultaPessoa(pessoa.getNomePessoa()) == false ) {
		p.inserir(pessoa);
	}else {
		throw new ObjetoJaCadastradoException("Erro: Este Pessoa já está cadastrado no sistema.");
	}
		
	}
	
 public List<Pessoa> listarOrdemAlfabetica() throws Exception{
		PessoaDao p = new PessoaDao();
		 return p.listarOrdemAlfabetica();
	}
 
 public List<Pessoa> getlistar() throws Exception{
		PessoaDao p = new PessoaDao();
		 return p.listar();
	}

 
 public void excluir(String CPF) throws Exception{
	   PessoaDao p = new PessoaDao();
		p.excluir(CPF);

	 
 }
 
 public void alterar(Pessoa pessoa) throws Exception {
	   PessoaDao p = new PessoaDao();
		p.alterar(pessoa);

	 
}
	public Pessoa consultar(String CPF) throws Exception{
		PessoaDao p = new PessoaDao();
			return p.consultar(CPF);
		
	}
	
}
	


