package clase05.entities;

public class Animal {
//No requiere metodo main por clase
	
	private String especie, sexo;
	private boolean comestible;
	
	
	public void hacerSonido() {
		System.out.println("El animal esta haciendo un sonido");
	}
	
	public boolean isComestible() {
		return comestible;
	}
	public void setComestible(boolean comestible) {
		this.comestible = comestible;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override //Decorador - sobreescribe el metodo principal -> Polimorfismo
	//El polimorfismo 
	public String toString() {
		return "Animal [especie=" + especie + ", comestible=" + comestible + "]";
	}



	
	
	
}
