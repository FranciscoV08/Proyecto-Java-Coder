package com.coderhouse.objetos.animados;

public class Perro {

	
	//Constante o variables de clase
	private  static final int EDAD_MAXIMA = 15;
	String messageError = "El perro no vive mas de " + EDAD_MAXIMA + " años de edad ";
	
	//Atributos del objeto o variables de instancia
	
	private String nombre, raza, color, tamaño;
	private int edad;
	private float peso;
		
		
	//ENCAPSULAMIENTO
		//(GETTERS and SETTERS) - metodos de clas que permiten acceder y modificar los atributos
		
		
		//GETER Y SETTER
		//Ahora le asignamos valores a los atributos pero por medio de metodos.
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getRaza() {
			return raza;
		}
		public void setRaza(String raza) {
			this.raza = raza;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getTamaño() {
			return tamaño;
		}
		public void setTamaño(String tamaño) {
			this.tamaño = tamaño;
		}
		public int getEdad() {
			return edad;
		}
		//Es de tipo exeption la funcionalidad
		public void setEdad(int edad) throws Exception {
			if(edad > EDAD_MAXIMA) {
				
				throw new Exception(messageError + edad);
			}else {				
				this.edad = edad;
			}
		}
		public float getPeso() {
			return peso;
		}
		public void setPeso(float peso) {
			this.peso = peso;
		}	
		

		//metodos de la clase perro
		//void - que retorne nada, que el metodo no devuelva ningun valor
		
			//No es conveniente los atributos de una clase sea publico, ya que es accesible desde donde quiera por problemas de scope
			
			public void comer() {
				System.out.println(this.nombre + " esta comiendo");
			}
			public void correr() { 
				System.out.println("el perro esta corriendo");
			}
			public void saltar() {
				System.out.println("el perro esta saltando");
			}
			public void caminar() {
				System.out.println("el perro esta caminando");
			}
			
			//como tiene tipado le decimos que devuelva algo como STRING
			public String mostrarAtributos() {
				return "Mi perro " + this.getNombre() + "es un " + getRaza() 
				+ "y es de color " + getColor() + " su raza es " + getRaza() 
				+ "tiene un tamaño de " + getTamaño() + "y pesa " + getTamaño();
			}
			
			//METODO STATICO 
			//le decimos que sea publico que sea estatico y que no retorne nada 
			public static void ladrar () {
				System.err.println("Guao, guao");
			}
			
			//Agregamos el metodo para generar / convertir todo en STRING
			//Es un metodo - una funcionalidad 
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ",la raza es " + raza + ", de color " + color + ", de tamaño " + tamaño + ", su edad es "
					+ edad + " años , pesa " + peso + "KG ]";
	}
}
