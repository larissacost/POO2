package Exercicios08_09_21;

public class testaFuncionario {

	public static void main(String[] args) {
		funcionario funcionario1 = new funcionario ("Richard Almeida",1054,"Redes sociais");
		
		System.out.println("\nO funcion�rio "+funcionario1.getNome()+" � matriculado no c�digo: "+funcionario1.getCodigo()+" no setor de "+funcionario1.getSetor());
	}

}
