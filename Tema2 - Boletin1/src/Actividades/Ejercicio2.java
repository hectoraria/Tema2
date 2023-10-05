package Actividades;

import java.util.Scanner;

public class Ejercicio2 {
		
		public static void main(String[] args) {
			
		//Variable para el numero 1 
		int numero1;
		//Variable para el numero 2
		int numero2;
		
		//abrimos un escaner 
		Scanner sc = new Scanner(System.in);
		//Mensaje para que introduzca el numero 1
		System.out.println("Introduzca el numero 1: "); 
		//Recoga el dato en la variable numero 1
		numero1 = sc.nextInt();
		//Mensaje para que introduzca el numero 2
		System.out.println("Introduzca el numero 2: "); 
		//Recoga el dato en la variable numero 2
		numero2 = sc.nextInt();
		//Copruebo si son iguales
		if (numero1==numero2){
		System.out.println("Es igual");
		}else {
		System.out.println("No es igual");
				}
		//Cierro el escaner
		sc.close();
				
		
		
		}
}