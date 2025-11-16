package com.coderhouse.entidades;

import com.coderhouse.abstractas.Vehiculo;

public class Auto extends Vehiculo {

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Mi auto " + getMarca() + " se esta encendiendo ");
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Mi auto " + getMarca() + " se esta Apagando ");
	}

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Mi auto " + getMarca() + " se esta Moviendo ");
	}

	
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ruedas=" + ruedas;
	}
	
	

}
