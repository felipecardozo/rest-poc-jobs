package com.opportun.it;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructorTest {

	@Test
	public void test() {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro(4, 2);
		Carro carro3 = new Carro(4, 4, "Azul");
	}
	
	
	class Carro{
		
		int ruedas, puertas;
		String color = "gris";
		
		Carro() { }
		
		Carro(int ruedas) {
			this.ruedas = ruedas;
		}
		
		Carro(int ruedas, int puertas) {
			this.ruedas = ruedas;
			this.puertas = puertas;
		}
		
		Carro(int ruedas, int puertas, String color) {
			this.ruedas = ruedas;
			this.puertas = puertas;
			this.color = color;
		}
		
	}
	

}
