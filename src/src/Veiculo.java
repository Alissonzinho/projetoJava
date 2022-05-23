// Alisson G. Scrok

package src;

public class Veiculo {
	
	String fabricante;
	String modelo;
	int ano;
	String placa;


	public Veiculo(String fabricante, String modelo, int ano, String placa) {

	this.fabricante = fabricante;
	this.modelo = modelo;
	this.ano = ano;
	this.placa = placa;
	}
	
	public String toString() {		
		
		return String.format("Fabricante: %s  \n Modelo: %s  \n Ano: %d \n Placa: %s \n", this.fabricante, this.modelo, this.ano, this.placa);
			
	}
	
}