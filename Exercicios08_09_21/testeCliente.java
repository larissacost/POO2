package Exercicios08_09_21;

public class testeCliente {

	public static void main(String[] args) {

		cliente cliente1 = new cliente("Andreia",999996666,"Alameda margaridas,67");
		

		System.out.println("\nA cliente "+cliente1.getNome()+" é cadastrada com o telefone: "+cliente1.getTelefone()+" no endereço "+cliente1.getEndereço());

	}

}
