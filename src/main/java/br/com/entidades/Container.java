package br.com.entidades;

import java.util.ArrayList;


public class Container {
	private static ArrayList<User> lista; 
	private static Integer id = 1;

	
	
	public Container() {}
		
		
	
	public Container(User user) {
		lista = new ArrayList<User>(); 
		adicionarUser(user);
	} 
		
	public void adicionarUser(User user) {
		lista.add(user); 
		id += 1;
	}
	
	public void removerUser(User user) {
		lista.remove(user);
		
	}
	
	public void alterarUser(User user, int id) {

		for(int i = 0; i< (id-1) ;i++) {
			for(User usuario: lista) {
				if (usuario.equals(user)) {
					lista.set(i,user);
				}
		}
	}
		
	}
	
}
