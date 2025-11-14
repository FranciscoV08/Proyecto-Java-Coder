package clase05.entities.mascotas.caninas;

import clase05.entities.mascotas.Mascota;

public class Perro extends Mascota {

	
	private String raza, color;
	
	
	
	
	//GETERS AND SETTERS
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


	//metodos 
	@Override
	public void comer() {
		System.out.println(super.getNombre() + "esta comiendo alimento para perros");
	}
}
