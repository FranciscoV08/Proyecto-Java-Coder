package clase05.entities.mascotas.felinos;

import clase05.entities.mascotas.Mascota;

public class Gato extends Mascota {
	@Override
	public void comer() {
		System.out.println(super.getNombre() + "esta comiendo alimento para gatos");
	}
}
