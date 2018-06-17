package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Naipe;

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
		naipe.nuevoNaipe();
		assertTrue(naipe.naipeListo());
	}
}
