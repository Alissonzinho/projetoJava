// Alisson G. Scrok

package src;

import java.util.ArrayList;

public class Condutor {
	
	String nome;
	int idade;
	String categoria;
	
	public Condutor(String nome, int idade, String categoria) {
		this.nome = nome;
		this.idade = idade;
		this.categoria = categoria;
	}

	
public String toString() {		
		return String.format("Nome: %s  \n Idade: %d  \n Categoria: %s", this.nome, this.idade, this.categoria);
	}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

}
