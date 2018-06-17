package ac.cr.cenfotec.logica;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Carta> naipe = new ArrayList<Carta>();
	
	public ArrayList<Carta> nuevoNaipe () 
	{
		
		agregarPalos();
		return naipe;
	}
	
	public void agregarPalos() 
	{
		String palo;
		
		for (int i = 0; i < 3; i++)
		{
			palo = definirPalo(i);
			naipe.add(new Carta("A", palo, 1));
			naipe.add(new Carta("Dos", palo, 2));
			naipe.add(new Carta("Tres", palo, 3));
			naipe.add(new Carta("Cuatro", palo, 4));
			naipe.add(new Carta("Cinco", palo, 5));
			naipe.add(new Carta("Seis", palo, 6));
			naipe.add(new Carta("Siete", palo, 7));
			naipe.add(new Carta("Ocho", palo, 8));
			naipe.add(new Carta("Nueve", palo, 9));
			naipe.add(new Carta("Diez", palo, 10));
			naipe.add(new Carta("J", palo, 10));
			naipe.add(new Carta("Q", palo, 10));
			naipe.add(new Carta("K", palo, 10));
		}
		
	}
	
	public String definirPalo(int i) {
		String palo = "";
		
		switch (i) 
		{
			case 0:
				palo = "Escudos";
				break;
			case 1: 
				palo = "Flores";
				break;
			case 2:
				palo = "Estrellas";
				break;
			case 3: 
				palo = "Gotas";
				break;
			default:
				break;
		}
		return palo;
	}
}

