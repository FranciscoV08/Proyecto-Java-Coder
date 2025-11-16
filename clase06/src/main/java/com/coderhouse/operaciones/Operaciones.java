//Es la clase padre donde seteamos todos los datos para manipularlos en otras clases independiente. Dependiendo su funcion con estos datos

package com.coderhouse.operaciones;

import com.coderhouse.interfaces.IOperableInterface;

public class Operaciones implements IOperableInterface {
	
	//Atributos - 
	protected double a;
	protected double b;

	
	
	
	//CONSTRUCTORS
	public Operaciones() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operaciones(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	



	//Metodos de la INTERFACES
	@Override
	public void enviarMensaje() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese 2 numeros para operar");
	}

	@Override
	public double operar(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void enviarResultado() {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la operacion es " + this.operar(this.a, this.b)) ;
	}
	
	//GETERS AND SETTERS
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	
	
}
