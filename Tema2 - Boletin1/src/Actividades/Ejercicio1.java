package Actividades;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos la variable del numero para poder si es par o impar
		int numero;
		//abrimos un escaner 
		Scanner sc = new Scanner(System.in);
		//Mensaje para que introduzca el numero
		System.out.println("Introduzca el numero: "); 
		//Recoga el dato en la variable numero
		numero = sc.nextInt();
		//Copruebo si es par
		if (numero%2==0){
		System.out.println("Si es par");
		}else {
		System.out.println("Si es impar");
		}
		//Cierro el escaner
		sc.close();
		

	}

}
