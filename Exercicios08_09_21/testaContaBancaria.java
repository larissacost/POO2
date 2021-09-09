package Exercicios08_09_21;

public class testaContaBancaria {

	public static void main(String[] args) {
		contaBancaria cliente1 = new  contaBancaria("Gilmar Santos",9730,258);
		
		System.out.println("\nO cliente: "+cliente1.getNome()+" tem a conta: "+cliente1.getConta()+" vinculada à agência: "+cliente1.getAgencia());

	}

}
