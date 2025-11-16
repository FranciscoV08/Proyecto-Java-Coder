package com.coderhouse.entidades;

import com.coderhouse.interfaces.IStringInterface;

public class Animal implements IStringInterface{

	@Override
	public String emitirSonido() {
		// TODO Auto-generated method stub
		return "Esta emitiendo un sonido";
	}

}
