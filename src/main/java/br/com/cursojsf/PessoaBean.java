package br.com.cursojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;


//@RequestScoped
//@SessionScoped
//@ApplicationScoped

@ViewScoped
@ManagedBean(name = "pessoaBean")//
public class PessoaBean {
	
	private String nome;
	private String senha;
	private String texto;
	
	private HtmlCommandButton commandButton;
	
	private List<String> nomes = new ArrayList<String>();
	
	
	
	public String addNome() {
		nomes.add(nome);
		if(nomes.size() > 3) {
	//		return "paginaNavegada";//navegação dinâmica
			
			return "paginaNavegada?faces-redirect=true";//Redirecionamento
		}
		
		return "";
	}
	
	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

	public HtmlCommandButton getCommandButton() {
		return commandButton;
	}

	public void setCommandButton(HtmlCommandButton commandButton) {
		this.commandButton = commandButton;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	

}
