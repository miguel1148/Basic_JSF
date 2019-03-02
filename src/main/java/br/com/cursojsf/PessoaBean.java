package br.com.cursojsf;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "pessoaBean")//
public class PessoaBean {
	
	private String nome;
	private String sobreNome;
	
	private String nomeCompleto;
	
	
	
	public String getNomeCompleto() {
		this.nomeCompleto = nome + " " + sobreNome;
		return nomeCompleto;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

}
