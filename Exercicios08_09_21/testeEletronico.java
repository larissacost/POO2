package Exercicios08_09_21;

public class testeEletronico {
	
	public static void main(String[] args) {
	produtoEletronico geladeira = new produtoEletronico("eletrodomestico","Brastemp Platinum",6899.00);
	

	System.out.println("\nA geladeira � um: "+geladeira.getCategoria()+" do modelo: "+geladeira.getModelo()+" cujo pre�o � "+geladeira.getPreco());
	
	}
}
