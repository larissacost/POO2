package Exercicios08_09_21;

public class cliente {
	   private String Nome;
	   private int telefone;
	   private String enderešo;
	   
	   public cliente(String nome,int telefone,String endereco)
	   {
		   this.Nome =  nome;
		   this.telefone = telefone;
		   this.enderešo = endereco;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	   
	   
}
