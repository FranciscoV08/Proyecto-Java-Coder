package clase05.entities.mascotas;

import clase05.entities.Animal;

public class Mascota extends Animal {

//	Ereda atributos y metodos . Ademas de geter & seteers de Animal
	
	private String nombre;
	private int edad;
	
	public void hacerSonido() {
		System.out.println(this.getNombre() + "esta haciendo ruido");
	}
	
	public void comer() {
		System.out.println(this.getNombre() + " esta comiendo alimento para perros");
	}
	
	
	
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
	
	
	@Override
	public String toString() {
											//isComestible viene de la clase padre a por eso el "super"
		return " --Es un animal comestible? " + super.isComestible() + ", y se llama " + this.getNombre()
		+ " y tiene una edad de " + this.getEdad() + " su especie es " + super.getEspecie();
	}

	
	
	
	
}
