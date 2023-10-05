package Actividades;
import java.util.Scanner;
public class Ejercicio4 {
		public static void main(String[] args) {
			
		//Variable para recoger el primer numero 
		float numero1;
		//Variable para recoger el segundo numero
		float numero2;
		//Abrimos un escaner 
		Scanner sc = new Scanner(System.in);
		//Mensaje para que introduzca el numero 1
		System.out.println("Introduzca el numero 1 (exprese el numero con la coma si es decimal) : "); 
		//Recoga el dato en la variable numero 1
		numero1 = sc.nextFloat();
		//Mensaje para que introduzca el numero 2
		System.out.println("Introduzca el numero 2 (exprese el numero con la coma si es decimal) : "); 
		//Recoga el dato en la variable numero 2
		numero2 = sc.nextFloat();
		//Compruebo cual es el mayor
		if (numero1>numero2){
		System.out.println( numero1+" es mayor que el " + numero2);
		}else {
			System.out.println( numero2+" es mayor que el " + numero1);
		}
		//Cierro el escaner
		sc.close();
				
		}
	}

