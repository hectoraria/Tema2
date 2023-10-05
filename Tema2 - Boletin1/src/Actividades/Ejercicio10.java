package Actividades;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Declaramos la variable para recoger el numero1
		int numero1;
		// Declaramos la variable para recoger el numero2
		int numero2;
		// Declaramos la variable para recoger el numero3
		int numero3;
		// abrimos un escaner
		Scanner sc = new Scanner(System.in);
		// Mensaje para que introduzca el numero1
		System.out.println("Introduzca el primer numero: ");
		// Mensaje para que reocoga el numero1
		numero1 = sc.nextInt();
		// Mensaje para que introduzca el numero2
		System.out.println("Introduzca el segundo numero: ");
		// Mensaje para que reocoga el numero2
		numero2 = sc.nextInt();
		// Mensaje para que introduzca el numero3
		System.out.println("Introduzca el tercer numero: ");
		// Mensaje para que reocoga el numero3
		numero3 = sc.nextInt();
		//  Condicional para ver si la suma de dos de esos números da como resultado el otro número
		if (numero1 + numero2 == numero3) {
			System.out.println("La suma de " + numero1 + " y el " + numero2 + " es igual a " + numero3);
		}
		else if (numero1 + numero3 == numero2) {
			System.out.println("La suma de " + numero1 + " y el " + numero3 + " es igual a " + numero2);
		}
		else if (numero2 + numero3 == numero1) {
			System.out.println("La suma de " + numero2 + " y el " + numero3 + " es igual a " + numero1);
		}
		else  {
			System.out.println("No da la suma de dos los números no da como resultado el otro número");
		}
		
		// Cierro el escaner
		sc.close();

	}

}