package Actividades;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Declaramos la variable para recoger el numero
		int numero;
		// abrimos un escaner
		Scanner sc = new Scanner(System.in);
		// Mensaje para que introduzca el numero
		System.out.println("Introduzca el numero entre (0 y 99999) : ");
		// Recoga el dato en la variable numero
		numero = sc.nextInt();
		// Copruebo el numero de cifras que tiene
		if (numero <= 0) {
			System.out.println("Tiene 0 cifras");
		} else if (numero < 10) {
			System.out.println("Tiene 1 cifras");
		} else if (numero < 100) {
			System.out.println("Tiene 2 cifras");
		} else if (numero < 1000) {
			System.out.println("Tiene 3 cifras");
		} else if (numero < 10000) {
			System.out.println("Tiene 4 cifras");
		} else if (numero < 100000) {
			System.out.println("Tiene 5 cifras");
		}
		// Cierro el escaner
		sc.close();

	}

}