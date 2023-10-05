package Actividades;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Declaro la variable del numero1
		int numero1;
		// Declaro la variable del numero2
		int numero2;
		// Declaro la variable del numero3
		int numero3;

		// Ordenar los números de mayor a menor usando condicionales
		int mayor, medio, menor;
		Scanner scanner = new Scanner(System.in);

		// Pedir al usuario que ingrese el primer numero
		System.out.print("Ingresa el primer número: ");
		// Recoger el primer numero en la variable numero1
		numero1 = scanner.nextInt();
		// Pedir al usuario que ingrese el segundo numero
		System.out.print("Ingresa el segundo número: ");
		// Recoger el primer numero en la variable numero1
		numero2 = scanner.nextInt();
		// Pedir al usuario que ingrese el tercer numero
		System.out.print("Ingresa el tercer número: ");
		// Recoger el primer numero en la variable numero1
		numero3 = scanner.nextInt();

		// Condicional para sacar todos los posibles resultados
		if (numero1 >= numero2 && numero1 >= numero3) {
			mayor = numero1;
			if (numero2 >= numero3) {
				medio = numero2;
				menor = numero3;
			} else {
				medio = numero3;
				menor = numero2;
			}
		} else if (numero2 >= numero1 && numero2 >= numero3) {
			mayor = numero2;
			if (numero1 >= numero3) {
				medio = numero1;
				menor = numero3;
			} else {
				medio = numero3;
				menor = numero1;
			}
		} else {
			mayor = numero3;
			if (numero1 >= numero2) {
				medio = numero1;
				menor = numero2;
			} else {
				medio = numero2;
				menor = numero1;
			}
		}

		// Mostrar los números ordenados
		System.out.println("Números ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);

		// Cerrar el scanner
		scanner.close();
	}
}