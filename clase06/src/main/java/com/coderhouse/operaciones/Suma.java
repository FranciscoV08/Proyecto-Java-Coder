package com.coderhouse.operaciones;

public class Suma extends Operaciones {

	//CONSTRUCTORES EREDADOS
	public Suma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suma(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	
	//METODOS
	@Override
	public double operar(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
	@Override
	public void enviarResultado() {
		// TODO Auto-generated method stub
		System.out.println("El resultado de la operacion es " + super.operar(super.a, super.b)) ;
	}
	
	
}
