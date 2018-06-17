package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Repartidor;

public class RepartidorTest {

	Repartidor repartidor;
	
	@Before 
	public void inicialize() 
	{
		repartidor = new Repartidor();
	}
	
	@Test
	public void repartidorConNaipe()
	{
		repartidor.barajarNaipe();
		assertTrue(repartidor.naipeListo());
	}
	
}
