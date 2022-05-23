// Alisson G. Scrok

package src;

import java.util.ArrayList;

public class Multa {
	
	String data;
	String hora;
	String tipoInfracao;
	int pontos;
	Veiculo veiculo;
	
	public Multa(String data, String hora, String tipoInfracao, int pontos, String condutor, Veiculo veiculo) {
		this.data = data;
		this.hora = hora;
		this.tipoInfracao = tipoInfracao;
		this.pontos = pontos;
		this.veiculo = veiculo;
	}
	
	public Multa() {
		
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTipoInfracao() {
		return tipoInfracao;
	}

	public void setTipoInfracao(String tipoInfracao) {
		this.tipoInfracao = tipoInfracao;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String toString() {
		return String.format("Data: %s \n Hora: %s \n Tipo de infração: %s \n Pontos: %d \n Condutor: %s \n Veiculo: %s \n");
	}
}
