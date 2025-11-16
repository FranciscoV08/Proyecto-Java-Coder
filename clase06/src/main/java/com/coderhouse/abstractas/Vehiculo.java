package com.coderhouse.abstractas;

// clase abstracta - se utiliza unicamente mediante un hijo de esta clase, no desde la misma
public abstract class Vehiculo {
	
	//Atributos protegidos dentro del package
	//
	protected String marca, modelo, color;
	protected Integer ruedas;
	
	//METODOS ES IGUAL PERO ABSTRACTOS
	protected abstract void encender();
	protected abstract void apagar();
	protected abstract void mover();
	
	public void mostrarCantidadDeRuedas() {
		System.out.println("Mi vehiculo " + this.getMarca() +" tiene" + getRuedas() + "de ruedas" );
	}
	
	
	//GETTERS AND SETTERS
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getRuedas() {
		return ruedas;
	}
	public void setRuedas(Integer ruedas) {
		this.ruedas = ruedas;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", ruedas=" + ruedas + "]";
	}
	
	
	
	
}
