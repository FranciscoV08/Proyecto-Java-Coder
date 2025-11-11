package com.coderhouse;
import java.util.Iterator;
import com.coderhouse.objetos.animados.Perro;
import com.coderhouse.objetos.animados.Gato;


public class clase04Objetos {

	//Para usar las exeptiones tambien es necesario que la funcion pueda manejar las mismas por eso se le agrega 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//ECOOMERCE DOÑACHOLA XD
		//
		//Perro perro = new Perro();
		/*
		perro.nombre = "Firulais";
		perro.color= "blanco";
		perro.edad = 2;
		perro.peso = 25;
		perro.raza = "doberman";
		perro.tamaño = "1m";
		
		System.out.println("mi perro se llama " + perro.nombre);
		System.out.println("color " + perro.color);
		System.out.println("edad " + perro.edad);
		System.out.println("raza " + perro.raza);
		System.out.println("peso " + perro.peso);
		
		System.out.println(perro);

		
		perro.correr();
		perro.caminar();
		perro.comer();
		perro.saltar();
		*/
		
		
		Perro perro1 = new Perro();
		Perro perro2 = new Perro();
		
		perro1.setNombre("firulais");
		perro1.setEdad(5);
		perro1.setPeso(22.0f);
		perro1.setColor("blanco");
		perro1.setRaza("Doverman");
		perro1.setTamaño("1 metro");
		
		//System.out.println(perro1);
		//perro1.comer();
		String atributos = perro1.mostrarAtributos();
		//System.out.println(atributos);
		
		//METODOS ESTATICOS -  no necesitamos instanciar la clase. Utilizamos la clase no la instancia
		//Perro.ladrar();
		Math.random();
		
		perro2.setNombre("firu");
		perro2.setEdad(4);
		perro2.setPeso(22.0f);
		perro2.setColor("negro");
		perro2.setRaza("chiguagua");
		perro2.setTamaño("20cm");
		
		//System.out.println(perro2.mostrarAtributos());
		
		
		double result = calcularElAreaDeunCirculo(4);
		//System.out.println(result);
		
		
		String[] nombres = {
				"Francisco",
				"eliot",
				"elizabeth"
		};
		 
		//imprimirListaDeNombres(nombres);
		
		
		//Utilizando la clase gato
		
		Gato gato = new Gato();
		
		gato.setNombre("Minino");
		gato.hablar();
		System.out.println(gato);
		
		
	}
	
	public static double calcularElAreaDeunCirculo( double radio) {
		return Math.PI *  Math.pow(radio, 2);
		
	}
	
	public static void imprimirListaDeNombres(String[] nombes) {
		for (String nombre: nombes) {
			System.out.println(nombre);
		}
	}
	
	
	//declaro primero 
	static final double PI;
	static final double DOUBLE_PI;
	 
	//Asigno despues
	static {
		PI = 3.14156;
		DOUBLE_PI = 6.28;
	}
	
	
	
	
	
	
	
	

}
