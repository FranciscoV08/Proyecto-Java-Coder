package com.coderhouse;
//import java.util.Scanner;

public class Clase02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//-------Control de flujos -------
			int numeroA = 5; 
			int numeroB = 3;
			
			//System.out.println(numeroA+ numeroB);
			
			if(numeroA > numeroB) {
				System.out.println("A es mayor que B");
			}else if(numeroA < numeroB){
				System.out.println("A es menor que B");
			}
			else {
				System.out.println("No es menor que ");
			}
			
			System.out.println("----Fin del programa----");
		*/
		
		//-----Calculadora----
		
		//double numeroA = 10, numeroB = 30;
		
		
		/*
			if(numeroB != 0) {
				int resultado = numeroA / numeroB;			
				
				System.out.println(resultado);
			}else {
				System.err.println("-----ERROR----- No se puede dividir en 0");
			}
		*/
		
		
		
		/*
		double resultado = numeroA / numeroB;			
		if(numeroB != 0) {
			System.out.println(resultado);
		}else {
			System.err.println("-----ERROR----- No se puede dividir en 0");
		}
		*/

		
	//---------Practicas mas dinamicas con la consola ------------
		
		//System es una clase que maneja recursos del sistema (entrada, salida, errores, etc.).
		//ystem.in representa la entrada estándar, o sea, lo que el usuario escribe en la consola.

		//Inicializacion del scanner que escucha la consola
		//Scanner scanner = new Scanner(System.in);
		 
		/*
		System.out.println("Ingresa un numero entero, en formato numerico");
		int numeroIngresado = scanner.nextInt();
		
		if(numeroIngresado > 0) {
			System.out.println("El numero " + numeroIngresado + " es positivo");
		}else {
			System.out.println("El numero "+ numeroIngresado + " es negativo");
		}
		System.out.println("su numero ingresado es: "+numeroIngresado);
		*/
		
		//System.out.println("Ingresa un numero entero, en formato numerico");
		//int numeroIngresado = scanner.nextInt();
		

		System.out.println("Ingresa un dia a la semana en minuscula");
			//Nextline se utiliza para string |	
		//String diaIngresado = scanner.nextLine().trim().toLowerCase();
		
		/*switch (diaIngresado) {
		case "lunes","martes","miercoles","jueves","viernes":
			System.out.println("hoy se labura");
			
			break;
		case "sabado","domingo":
			System.out.println("hoy se toma :)");
			
			break;
		default:
			break;
		}*/
		//System.out.println("sistema finalizado");
		
		
		//Cerramos el scanner ya que es necesario 
		//scanner.close();
		
		
		
	}

}
