package Actividades;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaramos la variable de a
		float a;
		//Declaramos la variable de b
		float b;
		//Declaramos la variable de c
		float c;
		//Declaramos la variable de x
		float x1;
		//Declaramos la variable de x
		float x2;
		//abrimos un escaner 
		Scanner sc = new Scanner(System.in);
		//Mensaje para que introduzca el a
		System.out.println("Introduzca el dato a: "); 
		//Recoga el dato en la variable a
		a = sc.nextFloat();
		//Mensaje para que introduzca el b
		System.out.println("Introduzca el dato b: "); 
		//Recoga el dato en la variable b
		b = sc.nextFloat();
		//Mensaje para que introduzca el c
		System.out.println("Introduzca el dato c: "); 
		//Recoga el dato en la variable c
		c = sc.nextFloat();
		//Calcular el valor de x con -b+
		x1 =(float) ((-b+(Math.sqrt(Math.pow(2,b)-4*a*c))) / 2*a  ) ;
		//Calcular el valor de x con -b-
		x2 =(float) ((-b-(Math.sqrt(Math.pow(2,b)-4*a*c))) / 2*a  ) ;
		//Condicional para ver si puedo hacer la ecuacion de segundo grado o no
		if ((a*(x1*x1))+ (b*x1)+(c+x1)==0){
			System.out.println("Las dos soluciones son: "+x1+" es el de + y el de - es: " +x2); 
		}else { 
			System.out.println("No se puede hacer"); 
		}
		 
		//Cierro el escaner
		sc.close();
		

	}

}
