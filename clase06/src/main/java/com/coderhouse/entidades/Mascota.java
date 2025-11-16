package com.coderhouse.entidades;

import com.coderhouse.interfaces.IAccionesInterface;
import com.coderhouse.interfaces.IAnimalInterface;

public class Mascota extends Animal implements IAnimalInterface, IAccionesInterface{
	

	//----------Atributo-------------

	private int edad;
	private boolean estaVivo;
	
	//----------------constructor----------
	
	//Ereda de super todo es como cualquier instancia
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//Constructor que toma parametros para armar 
	public Mascota(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	
	//-------------Geters and setters-----------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	private String nombre;
	public boolean isEstaVivo() {
		return estaVivo;
	}
	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}
	
	
	//-----------------ToString-----------------
	@Override // - Polimorfismo existe para sobre escribir el metodo
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}

	//---------Metodos de la interface -----------
	
		//------------Metodos--------------
	@Override public void comer() {
		System.out.println("La mascota esta comiendo");
	}
	
	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void saltar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean estaVivo() {
		// TODO Auto-generated method stub
		return this.estaVivo;
	}

	//--------METODOS DE IAACCIONESINTERFACE------

	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String emitirSonido() {
		// TODO Auto-generated method stub
		return this.getNombre() + " esta emitiendo un sonido";
	}
	 
}
