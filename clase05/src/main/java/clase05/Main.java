package clase05;


import clase05.entities.mascotas.Mascota;
import clase05.entities.mascotas.caninas.Perro;
import clase05.entities.mascotas.felinos.Gato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Erencia - Ereda todo los atributos 
		
		//Instancio la clase mascota 
		Perro perro = new Perro();
		
		perro.setEspecie("perro");
		perro.setComestible(false);
		
		perro.setEdad(2);
		perro.setNombre("Firulais");
		
		System.out.println(perro);
		perro.comer();
		
	//
		Mascota hamster = new Mascota();
		hamster.setEspecie("hamster");
		hamster.setComestible(false);
		
		hamster.setEdad(2);
		hamster.setNombre("tilin");
		
		System.out.println(hamster);
		hamster.comer();
		
		Gato gatito = new Gato();
		gatito.setEspecie("gato");
		gatito.setComestible(false);
		
		gatito.setEdad(2);
		gatito.setNombre("Minina");
		
		System.out.println(gatito);
		gatito.comer();
	}

}
