package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Carta;

public class CartaTest {
	
	Carta carta;

	@Before
	public void initialize() {
		carta = new Carta();
	}	

	@Test(expected=Exception.class)
	public void valorMayorQueDiez() throws Exception {
		Carta nuevaCarta = new Carta();
		nuevaCarta.setValor(11);
	}
	
	@Test 
	public void cartasIguales() {
		Carta primeraCarta = new Carta("Siete","Estrellas", 7);
		Carta segundaCarta = new Carta("Siete", "Estrellas", 7);
		assertTrue(primeraCarta.equals(segundaCarta));
	}
	

}
