package Exercicios08_09_21;

public class testaPaciente {

	public static void main(String[] args) {
		paciente paciente1 = new  paciente("Am�rico Almodovar","queimados","Santa Cruz");
		
		System.out.println("\nO paciente: "+paciente1.getNome()+" est� na ala de: "+paciente1.getAla()+" do hospital: "+paciente1.getHospital());

	}

}
