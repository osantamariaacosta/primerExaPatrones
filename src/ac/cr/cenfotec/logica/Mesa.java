package ac.cr.cenfotec.logica;

import java.util.ArrayList;

public class Mesa {
	public Repartidor repartidor = new Repartidor();;
	public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	public ArrayList<Carta> naipeMesa = new ArrayList<Carta>();
	/**
	 * @return the repartidor
	 */
	public Repartidor getRepartidor() {
		return repartidor;
	}
	/**
	 * @param repartidor the repartidor to set
	 */
	public void setRepartidor(Repartidor repartidor) {
		this.repartidor = repartidor;
	}
	/**
	 * @return the jugadores
	 */
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	/**
	 * @param jugadores the jugadores to set
	 */
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	/**
	 * @return the naipeMesa
	 */
	public ArrayList<Carta> getNaipeMesa() {
		return naipeMesa;
	}
	/**
	 * @param naipeMesa the naipeMesa to set
	 */
	public void setNaipeMesa(ArrayList<Carta> naipeMesa) {
		this.naipeMesa = naipeMesa;
	}
	public void darCarta() 
	{
		
		Carta nuevaCarta = new Carta();
		Jugador jugadorReceptor = new Jugador();
		
		repartidor.barajarNaipe();
		
		naipeMesa = repartidor.getNaipe();
		nuevaCarta = naipeMesa.get(0);
		
		naipeMesa.remove(0);
		
		agregarJugador(new Jugador());
		jugadorReceptor = jugadores.get(0);
		
		jugadorReceptor.darCarta(nuevaCarta);
		
		jugadores.set(0, jugadorReceptor);
		
	}
	
	public String agregarJugador(Jugador nuevoJugador)
	{
		String mensaje = "";
		if (jugadores.size() < 3) 
		{
			jugadores.add(nuevoJugador);
			mensaje = "Jugador Agregado";
			
		} else {
			
			mensaje = "La mesa está llena";
			
		}

		return mensaje;
	}
	
	public boolean hayJugadores() 
	{
		boolean hayJugadores;
		if(jugadores == null || jugadores.size() == 0)
		{
			hayJugadores = false;
		}
		else{
			hayJugadores = true;
		}
		
		return hayJugadores;
	}
	
}
