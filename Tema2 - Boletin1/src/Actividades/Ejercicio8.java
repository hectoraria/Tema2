package Actividades;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos la variable para recoger la nota
		int nota;
		//abrimos un escaner 
		Scanner sc = new Scanner(System.in);
		//Mensaje para que introduzca la nota
		System.out.println("Introduze tu nota (0 - 10) : "); 
		//Recoga el dato en la variable nota
		nota = sc.nextInt();
		//Copruebo el numero para que te diga que nota es
		if (nota<5){
		System.out.println("Insuficiente");
		}else if (nota==5) {
		System.out.println("Suficiente");
		}else if (nota==6) {
		System.out.println("Bien");
		}else if (nota<=8) {
		System.out.println("Notalbe");
		}else if (nota>=9) {
		System.out.println("Sobresaliente");
		}
		
		//Cierro el escaner
		sc.close();
		

	}

}