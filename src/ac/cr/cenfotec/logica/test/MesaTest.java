package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.Carta;
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
		String mensaje = "La mesa est� llena";
		for (int i = 0; i < 4; i++)
		{
			mesa.agregarJugador(new Jugador());
		}
		
		assertTrue(mensaje.equals(mesa.agregarJugador(new Jugador())));
	}
	
	@Test 
	public void darCarta()
	{


	}
	
	@Test
	public void jugadoresConDosCartas()
	{
		Jugador jugador = new Jugador();
		
		for(int i = 0; i < 4; i++)
		{
			mesa.agregarJugador(jugador);
		}
		
		mesa.darCartasATodos();
		jugador = mesa.getJugadores().get(3);
		assertEquals(2 ,  jugador.getMano().size());
	}
	
	@Test
	public void ganadorDelJuego() 
	{
		
		for(int i = 0; i < 4; i++)
		{
			mesa.agregarJugador(new Jugador(2));
		}
		mesa.darCartasATodos();
		assertEquals(2 ,  mesa.calcularGanador());
		
	}
	
	@Test
	public void jugadoresConSieteCartas()
	{
		Jugador jugador = new Jugador();
		
		for(int i = 0; i < 7; i++)
		{
			mesa.agregarJugador(jugador);
		}
		
		mesa.darCartasRon();
		jugador = mesa.getJugadores().get(3);
		assertEquals(7 ,  jugador.getMano().size());
	}
	
	@Test 
	public void reiniciarMesa()
	{
		Jugador jugador = new Jugador();
		ArrayList<Carta> naipeMesa = new ArrayList<Carta>();
		
		for(int i = 0; i < 7; i++)
		{
			mesa.agregarJugador(jugador);
		}
		mesa.darCartasRon();
		mesa.resetearMesa();

		naipeMesa = mesa.getNaipeMesa();
		assertEquals(52, naipeMesa.size());
		assertEquals(0, mesa.getJugadores().size());
	}
	
	@Test
	public void cambiarDeMano() {
		ArrayList<Carta> mano = new ArrayList<Carta>();
		Jugador nuevoJugador = new Jugador();
		
		mano.add(new Carta("J", "Estrellas", 10));
		mano.add(new Carta("Q", "Estrellas", 10));
		mano.add(new Carta("K", "Estrellas", 10));
		mano.add(new Carta("Tres", "Estrellas", 3));
		
		nuevoJugador.setMano(mano);
		
		assertEquals(4, mesa.verificarCambio(nuevoJugador));
	}
	
	@Test 
	public void deck() 
	{
		Carta cartaTomada = new Carta();
		cartaTomada = mesa.tomarCartadeck();
		assertTrue(cartaTomada.instanciada(cartaTomada));
		assertEquals(51 , mesa.getDeck().size());
	}
	
	@Test 
	public void cambiarCarta() 
	{
		ArrayList<Carta> mano = new ArrayList<Carta>();
		Jugador nuevoJugador = new Jugador();
		
		mano.add(new Carta("J", "Estrellas", 10));
		mano.add(new Carta("Q", "Estrellas", 10));

		
		nuevoJugador.setMano(mano);
		Carta cartaTomada = new Carta();
		cartaTomada = mesa.tomarCartadeck();
		assertFalse(mesa.confirmarCambioDeCarta(cartaTomada, nuevoJugador));
	}
	
}
