package com.coderhouse.objetos.animados;

public class Gato {
	
	//atributos
	private String nombre, apellido, email;
	private int edad;
	
	
	
	//Funcionalidades - metodos
	
	//Getter and setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", edad=" + edad + "]";
	}
	
	public void hablar() {
		System.err.println("Esta hablando " + getNombre());
	}
	
}
