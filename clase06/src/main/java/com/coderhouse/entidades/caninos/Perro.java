package com.coderhouse.entidades.caninos;

import com.coderhouse.entidades.Mascota;
import com.coderhouse.interfaces.IPerroInterface;

//Implements le dice que utilize interfacePerro 
public class Perro extends Mascota implements IPerroInterface{
//Como esta clase ereda todo de Mascota significa que tendra todo lo que tenga Mascota por eso ereda sus constructores
	
	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void olfatear() {
		// TODO Auto-generated method stub
		System.out.println("Mi perro " + super.getNombre() + "Esta olfateando un lugar");
		
	}

	@Override
	public void ladrar() {
		// TODO Auto-generated method stub
		System.out.println("Mi perro " + super.getNombre() + " esta ladrando");
		
	}

	@Override
	public void moverLacola() {
		// TODO Auto-generated method stub
		System.out.println(super.getNombre() + " esta moviendo la cola ");
		
	}
	@Override
	public void comer() {
		System.out.println(super.getNombre() + " esta comiendo");
	}
	
	@Override
	public String toString() {
		return "Mi Perro " + getNombre() + ", tiene una edad de " + getEdad() ;
	}
	
	
	//METODOS DE IAACIIONESINTERFACE
	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		if(super.isEstaVivo()) {
			System.out.println(super.getNombre() + " esta vivo...!");
		}else {
			System.out.println(super.getNombre() + " no esta vivo :/");
		}
	}


	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println(super.getNombre() + " esta respirando");
	}
	
	
	


}
