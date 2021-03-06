package ac.cr.cenfotec.logica;

import java.util.ArrayList;

public class Mesa {
	public Repartidor repartidor = new Repartidor();
	public ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	public ArrayList<Carta> naipeMesa = new ArrayList<Carta>();
	public ArrayList<Carta> deck = new ArrayList<Carta>();
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
	
	
	/**
	 * @return the deck
	 */
	public ArrayList<Carta> getDeck() {
		return deck;
	}
	/**
	 * @param deck the deck to set
	 */
	public void setDeck(ArrayList<Carta> deck) {
		this.deck = deck;
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
	
	public void jugarVeintiUno()
	{
		darCartasATodos();	
	}
	
	public void darCartasATodos() 
	{
		
		Carta primeraCarta = new Carta();
		Carta segundaCarta = new Carta();
		repartidor.barajarNaipe();
		naipeMesa = repartidor.getNaipe();
		
		for (int i = 0; i < 1; i++)
		{
			primeraCarta = naipeMesa.get(0);
			segundaCarta = naipeMesa.get(1);
			naipeMesa.remove(0);
			naipeMesa.remove(1);
			
			jugadores.get(i).darCarta(primeraCarta);
			jugadores.get(i).darCarta(segundaCarta);
		}
	}
	
	
	public int calcularGanador() 
	{
		int numeroMayor = 0;
		int ganador = -1;
		int sumatoria = 0;
		
		
		for( Jugador jugador: jugadores) {
			for(int j = 0; j < jugador.getMano().size(); j++) {
				sumatoria += jugador.getMano().get(j).getValor();
			} 
			if (sumatoria > 0 && sumatoria < 21 && sumatoria > numeroMayor)
			{
				numeroMayor = sumatoria;
				
				ganador = jugador.getNumero();
				
			} 
		}
		
		return ganador;
	}
	
	public String agregarJugador(Jugador nuevoJugador)
	{
		String mensaje = "";
		if (jugadores.size() < 4) 
		{
			jugadores.add(nuevoJugador);
			mensaje = "Jugador Agregado";
			
		} else {
			
			mensaje = "La mesa est� llena";
			
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
	
	public void empezarPartidaRon() 
	{
		darCartasRon();
	}
	
	
	public void darCartasRon() 
	{

		Carta primeraCarta = new Carta();
		Carta segundaCarta = new Carta();
		Carta terceraCarta = new Carta();
		Carta cuartaCarta = new Carta();
		Carta quintaCarta = new Carta();
		Carta sextaCarta = new Carta();
		Carta setimaCarta = new Carta();
		repartidor.barajarNaipe();
		naipeMesa = repartidor.getNaipe();
		
		for (int i = 0; i < 1; i++)
		{
			primeraCarta = naipeMesa.get(0);
			segundaCarta = naipeMesa.get(1);
			terceraCarta = naipeMesa.get(2);
			cuartaCarta = naipeMesa.get(3);
			quintaCarta = naipeMesa.get(4);
			sextaCarta = naipeMesa.get(5);
			setimaCarta = naipeMesa.get(6);
			naipeMesa.remove(0);
			naipeMesa.remove(1);
			naipeMesa.remove(2);
			naipeMesa.remove(3);
			naipeMesa.remove(4);
			naipeMesa.remove(5);
			naipeMesa.remove(6);
			
			jugadores.get(i).darCarta(primeraCarta);
			jugadores.get(i).darCarta(segundaCarta);
			jugadores.get(i).darCarta(terceraCarta);
			jugadores.get(i).darCarta(cuartaCarta);
			jugadores.get(i).darCarta(quintaCarta);
			jugadores.get(i).darCarta(sextaCarta);
			jugadores.get(i).darCarta(setimaCarta);
		}
	}
	
	
	public void resetearMesa() 
	{
		Repartidor nuevoRepartidor = new Repartidor();;
		ArrayList<Jugador> sinJugadores = new ArrayList<Jugador>();
		
		repartidor = nuevoRepartidor;
		repartidor.barajarNaipe();
		jugadores = sinJugadores;
		naipeMesa = repartidor.getNaipe();
		
	}
	
	public int verificarCambio(Jugador jugador)
	{
		String nombreCarta = "";
		int cantAciertos = 0;

			for(int i = 0; i < jugador.getMano().size(); i++) {
				nombreCarta = jugador.getMano().get(i).getNombre();
				if (nombreCarta.equals("J") || nombreCarta.equals("Q") || nombreCarta.equals("K") || nombreCarta.equals("Tres"))
				{
					cantAciertos++;
				}
				
			} 

		return cantAciertos;
	}
	
	
	public Carta tomarCartadeck() 
	{
		Carta nuevaCarta = new Carta();
		
		repartidor.barajarNaipe();
		
		deck = repartidor.getNaipe();
		nuevaCarta = deck.get(0);
		
		deck.remove(0);
		
		return nuevaCarta;
	}
	
	public boolean confirmarCambioDeCarta(Carta nuevaCarta, Jugador jugador)
	{
		boolean cambioInvalido = false;
		Carta primeraCartaAnterior = new Carta();
		Carta segundaCartaAnterior = new Carta();
		
		primeraCartaAnterior = jugador.getMano().get(0);
		segundaCartaAnterior = jugador.getMano().get(0);
		
		int numero = (int) (Math.random() * 1) + 1;
		
		jugador.getMano().set(numero, nuevaCarta); 
		
		if (nuevaCarta.getNombre().equals(primeraCartaAnterior.getNombre()) && nuevaCarta.getPalo().equals(primeraCartaAnterior.getPalo())  
				|| nuevaCarta.getNombre().equals(segundaCartaAnterior.getNombre()) && nuevaCarta.getPalo().equals(segundaCartaAnterior.getPalo()))
		{
			cambioInvalido = true;
		}

		return cambioInvalido; 
		
	}
	
}
