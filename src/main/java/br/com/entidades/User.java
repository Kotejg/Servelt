package br.com.entidades;

public class User {
	private String nome; 
	private String email; 
	private String pais;  
	private String telefone;

	
	public User(String nome,String email,String pais, String telefone) {
		this.nome = nome; 
		this.email = email; 
		this.pais = pais; 
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return "User [nome=" + nome + ", email=" + email + ", pais=" + pais + ", telefone=" + telefone + "]";
	} 
	
	
	
	
}
