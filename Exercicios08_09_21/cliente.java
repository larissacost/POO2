package Exercicios08_09_21;

public class cliente {
	   private String Nome;
	   private int telefone;
	   private String endere�o;
	   
	   public cliente(String nome,int telefone,String endereco)
	   {
		   this.Nome =  nome;
		   this.telefone = telefone;
		   this.endere�o = endereco;
	   }

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	   
	   
}
