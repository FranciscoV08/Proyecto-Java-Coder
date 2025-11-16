package com.coderhouse.sobrecarga;

import com.coderhouse.interfaces.ImpresorasInterface;

public class Impresora implements ImpresorasInterface {
	//Sobrecarga y sobreescritura de metodos
	
	
	@Override
	public void imprimir() {
		System.out.println("la impresora esta imprimiendo");
	}
	
	public void imprimir(int numero) {
		System.out.println("la impresora esta imprimiendo el numero " + numero);
	}
	public void imprimir(int a, int b ) {
		System.out.println("la impresora esta imprimiendo el numero " + a + " y el numero " + b);
	}
	public void imprimir(String palabra, int b ) {
		System.out.println("la impresora esta imprimiendo el numero " + palabra + " y el numero " + b);
	}
}
