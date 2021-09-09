package Exercicios08_09_21;

public class testaPaciente {

	public static void main(String[] args) {
		paciente paciente1 = new  paciente("Américo Almodovar","queimados","Santa Cruz");
		
		System.out.println("\nO paciente: "+paciente1.getNome()+" está na ala de: "+paciente1.getAla()+" do hospital: "+paciente1.getHospital());

	}

}
