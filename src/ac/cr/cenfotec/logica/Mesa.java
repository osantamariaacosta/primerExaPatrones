package ac.cr.cenfotec.logica;

import java.util.ArrayList;

public class Mesa {
	private Repartidor repartidor;
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
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
