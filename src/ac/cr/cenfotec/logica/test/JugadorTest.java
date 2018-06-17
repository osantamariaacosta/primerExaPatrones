package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Carta;
import ac.cr.cenfotec.logica.Jugador;

public class JugadorTest {

	Jugador jugador;
	
	@Before
	public void inicialize()
	{
		jugador = new Jugador();
	}
	
	@Test
	public void jugadorCreado () {
		assertTrue(jugador.instanciado(jugador));
	}
	
	@Test
	public void manoLista() 
	{
		jugador.darCarta(new Carta("Dos", "Estrellas", 2));
		assertTrue(jugador.manoLista());
	}

}
