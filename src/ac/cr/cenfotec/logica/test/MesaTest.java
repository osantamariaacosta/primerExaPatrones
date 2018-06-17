package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import ac.cr.cenfotec.logica.Jugador;
import ac.cr.cenfotec.logica.Mesa;

public class MesaTest {

	Mesa mesa;
	
	@Before
	public void inicialize()
	{
		mesa = new Mesa();
	}
	
	@Test
	public void mesaConJugadores() {
		mesa.agregarJugador(new Jugador());
		assertTrue(mesa.hayJugadores());
	}
	
	@Test 
	public void mesaLlena()
	{
		String mensaje = "La mesa está llena";
		for (int i = 0; i < 3; i++)
		{
			mesa.agregarJugador(new Jugador());
		}
		
		assertTrue(mensaje.equals(mesa.agregarJugador(new Jugador())));
	}
}
