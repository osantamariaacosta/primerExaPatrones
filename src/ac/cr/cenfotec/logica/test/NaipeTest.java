package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Naipe;
import ac.cr.cenfotec.logica.Carta;

public class NaipeTest {
	Naipe naipe;
	
	@Before
	public void inicialize() 
	{
		naipe = new Naipe();
	}
	
	@Test 
	public void nuevoNaipe()
	{
		ArrayList<Carta> nuevoNaipe;
		Naipe nuevo = new Naipe();
		nuevoNaipe = nuevo.nuevoNaipe();
		assertEquals(nuevoNaipe, naipe.nuevoNaipe());
	}
}
