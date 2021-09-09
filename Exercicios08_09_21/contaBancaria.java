package Exercicios08_09_21;

public class contaBancaria {
	   private String nome;
	   private int conta;
	   private int agencia;
	   
	public contaBancaria(String nome, int conta, int agencia) {
		this.nome = nome;
		this.conta = conta;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	   
}
