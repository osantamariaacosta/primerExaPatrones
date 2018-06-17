package ac.cr.cenfotec.logica;

import java.util.ArrayList;

public class Jugador {
	private int numero; 
	private ArrayList<Carta> mano = new ArrayList<Carta>();
	
	
	
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the mano
	 */
	public ArrayList<Carta> getMano() {
		return mano;
	}

	/**
	 * @param mano the mano to set
	 */
	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}

	public void darCarta (Carta nuevaCarta)
	{
		mano.add(nuevaCarta);
	}
	
	public boolean manoLista() 
	{
		boolean manoLista;
		if(mano == null || mano.size() == 0)
		{
		  manoLista = false;
		}
		else{
		 manoLista = true;
		}
		
		return manoLista;
	}
	
	public boolean instanciado(Jugador nuevoJugador)
	{
		boolean instanciado = false;
		if (nuevoJugador != null) 
		{ 
			instanciado = true; 
		} 
		return instanciado;
	}
	
}
