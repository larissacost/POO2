package Exercicios08_09_21;

public class funcionario {
	   private String nome;
	   private int codigo;
	   private String setor;
	   
	   public funcionario(String nome, int codigo, String setor)
	   {
		this.nome = nome;
		this.codigo = codigo;
		this.setor = setor;
	   }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	

}
