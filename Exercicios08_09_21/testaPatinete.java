package Exercicios08_09_21;

public class testaPatinete {

	public static void main(String[] args) {
	   patinete novo1 = new  patinete("Xiaomi","elétrico  M365",4890.00);
		

		System.out.println("\nO patinete da marca: "+novo1.getMarca()+" do modelo: "+novo1.getModelo()+" custa: "+novo1.getPreco());

	}

}
