package NumeroEstacion;

import java.util.Scanner;

public class numeroEstacion {

	public static void main(String[] args) {
		
		//Variables
		int numeroEstacion;
		String estacion=("");
		
		Scanner teclado=new Scanner(System.in);

		//Entrada de datos
		System.out.println("Dime el n�mero de estaci�n:");
		numeroEstacion=teclado.nextInt();
		
		//Estructura condicional
		
		switch(numeroEstacion){
		case 1: estacion="Verano";break;
		case 2: estacion="Oto�o";break;
		case 3: estacion="Invierno";break;
		case 4: estacion="Primavera";break;
		default: estacion="\nError al introducir el n�mero, por favor introduzca un n�mero entre el 1 y el 4";break;
		}
		//Salida de datos
		System.out.println("La estaci�n es "+estacion+".");
		
		teclado.close();
	
	}

}
