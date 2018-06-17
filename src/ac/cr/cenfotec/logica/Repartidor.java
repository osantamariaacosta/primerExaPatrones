package ac.cr.cenfotec.logica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Repartidor {
	private ArrayList<Carta> naipe = new ArrayList<Carta>();

	/**
	 * @return the naipe
	 */
	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	/**
	 * @param naipe the naipe to set
	 */
	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}
	
	public void barajarNaipe() 
	{
		Naipe nuevoNaipe = new Naipe();
		nuevoNaipe.nuevoNaipe();
		
		naipe = nuevoNaipe.getNaipe();
		
        Random rndm = new Random();
        Collections.shuffle(naipe, rndm);
	}
	
	public boolean naipeListo() 
	{
		boolean naipeListo;
		if(naipe == null || naipe.size() == 0)
		{
		  naipeListo = false;
		}
		else{
		 naipeListo = true;
		}
		
		return naipeListo;
	}

	
}
