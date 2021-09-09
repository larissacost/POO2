package Exercicios08_09_21;

public class paciente {
	   private String nome;
	   private String ala;
	   private String hospital;
	   
	public paciente(String nome, String ala, String hospital) {
		this.nome = nome;
		this.ala = ala;
		this.hospital = hospital;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAla() {
		return ala;
	}
	public void setAla(String ala) {
		this.ala = ala;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	   
}
