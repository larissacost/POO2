package Exercicios08_09_21;

public class aviao {
	   private String aviacao;
	   private int modelo;
	   private int frota;
	   
	   public aviao(String aviacao,int modelo,int frota)
	   {
		  this.aviacao = aviacao;
		  this.modelo = modelo;
		  this.frota = frota;
	   }

	public String getAviacao() {
		return aviacao;
	}

	public void setAviacao(String aviacao) {
		this.aviacao = aviacao;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getFrota() {
		return frota;
	}

	public void setFrota(int frota) {
		this.frota = frota;
	}

}
