package java_primeros_pasos;

public class TipoVariable {

	public static void main(String[] args) {
		System.out.println("Holap");
		
		// TIPO INT 
		
		int edad = 23;
		System.out.println("==========TIPO INT==========");
		System.out.println(edad);
		
		edad = 23 + 0;
		
		System.out.println("Mi edad es " + edad);
		
		// TIPO DOUBLE
		
		double salario = 1050.90;
		double mitadSalario = salario / 2;
		
		System.out.println("\n==========TIPO DOUBLE==========");
		System.out.println("Mi salario es " + salario);
		System.out.println("Mi salario es " + mitadSalario);
		
		//CONVERSIONES
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1; //CAST
		
		double resultado = variable1 + variable1Entero;
		
		System.out.println("\n==========CONVERSIONES==========");
		System.out.println(variable1Entero);
		System.out.println(resultado);
		
		//TIPO LONG, SHORT, BYTE, FLOAT
		
		long prueba = 1222222222222222222L;
		short numPequeno = 11111;
		byte numerMasPequeño = 23;
		float numDecimal = 2.5F;
		
	}
}
