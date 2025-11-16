package com.coderhouse;
import com.coderhouse.entidades.Auto;
//Clase que importa para usar Perro
import com.coderhouse.entidades.caninos.Perro;
import com.coderhouse.operaciones.Suma;
import com.coderhouse.sobrecarga.Impresora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciamos la clase perro para usarlo
		/*Perro perro = new Perro("FirusLais ", 2);
		
		perro.olfatear();
		perro.ladrar();
		perro.moverLacola();
		perro.comer();
		perro.setEstaVivo(false);
		perro.respirar();
		
		System.out.println(perro.emitirSonido());
		*/
		/*
		Suma suma = new Suma( 12, 56);
		suma.enviarMensaje();
		suma.enviarResultado();
		
		
		Suma suma2 = new Suma();
		suma2.setA(20);
		suma2.setB(5);
		
		suma2.enviarMensaje();
		suma2.enviarResultado();
		*/
		/*
		Auto cronos = new Auto();
		cronos.setColor("Negro");
		cronos.setMarca("Ford");
		cronos.setModelo("Cronos");
		cronos.setRuedas(4);
		
		cronos.encender();
		
		
		System.out.println(cronos);
		*/
		
		
		//SOBRE CARGA DE METODOS
		//Sobrecarga - 
		Impresora impreso = new Impresora();
		impreso.imprimir();
		impreso.imprimir(24);
		impreso.imprimir(22, 55);
		impreso.imprimir("Hola Mundo", 55);
		
		System.out.println();
	}

}
