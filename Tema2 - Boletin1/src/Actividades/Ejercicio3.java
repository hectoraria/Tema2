package Actividades;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
	//Variable para el numero float para que pueda recoger el decimal
	float numero1;
	
	//abrimos un escaner 
	Scanner sc = new Scanner(System.in);
	//Mensaje para que introduzca el numero 1
	System.out.println("Introduzca el numero decimal (exprese el numero con la coma) : "); 
	//Recoga el dato en la variable numero 1
	numero1 = sc.nextFloat();

	//Copruebo si son cercanos al cero
	if (numero1>-1 || numero1<1){
	System.out.println("Esta cerca del 0");
	}else if (numero1 == 0){
	System.out.println("Es 0 ");
	}else {
		System.out.println("No esta cerca");
	}
	//Cierro el escaner
	sc.close();
			
	}
}
