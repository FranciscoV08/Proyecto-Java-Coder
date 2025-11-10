package com.coderhouse;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class clase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//Definicion de Array - las listas de array tambien tienen tipados en java
		int[] numerosEnteros = new int[5];
		numerosEnteros[0] = 2;
		
		//String[] palabras = new String[5];
		
		
		
		//Array de palabras -- Esto es equivalente a lo que esta abajo
		 String[] palabrasObj = {
				 "argentina",
				 "francisco", 
				 "jujuy",
				 "coderhouse"
		 };
		
		 /*
		 String[] palabrasObj = new String[4];
		 palabrasObj[0] = "argentina";
		 palabrasObj[1] = "francisco";
		 palabrasObj[2] = "jujuy";
		 palabrasObj[3] = "coderhouse";
		 */
		 
		 int[] numerosArray = {1,2,3,4,5,6,7};
		 
		 
		//System.out.println("El elemento en la posicion 3 es: " + Arrays.toString(numerosArray));
		
		 
		 
		 //Listas
		 
		 List<String> Palabras = new ArrayList<>();
		 List<String> Palabras2 = new ArrayList<>();
		 
		 
		 Palabras.add("hola");
		 Palabras.add("mundo");
		 Palabras.add("coder");
		 Palabras.add("java");
		 
		 Palabras2.add("hola mundo");
		 //Palabras2.addAll(Palabras);
		 //Palabras.clear();
		 //System.out.println("los elementos de la lista es: " + Palabras;
		 
		 
		 
		 //iterator
		// Iterator<String> iterator = Palabras.iterator();
		
		/* while(iterator.hasNext()){
			  String palabra = iterator.next();
			  System.out.println("Palabras "  + palabra);
			  iterator.remove();
		 }*/
		 
		 int index = 0;
		 while(!Palabras.isEmpty()) {
			 System.out.println(Palabras);
		 }
		 
	}

}
