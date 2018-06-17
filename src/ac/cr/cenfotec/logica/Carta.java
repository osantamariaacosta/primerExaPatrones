package ac.cr.cenfotec.logica;

import java.util.Objects;

public class Carta {
	private String nombre;
	private String palo;
	private int valor;
	private int limite = 10;
	
	public Carta() {
	}

	/**
	 * @param name
	 * @param palo
	 * @param valor
	 */
	public Carta(String name, String palo, int valor) {
		this.nombre = name;
		this.palo = palo;
		this.valor = valor;
	}

	/**
	 * @return the name
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param name the name to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the palo
	 */
	public String getPalo() {
		return palo;
	}

	/**
	 * @param palo the palo to set
	 */
	public void setPalo(String palo) {
		this.palo = palo;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) throws Exception{
		
		if (valor < limite) {
			this.valor = valor;
		}
		else 
		{
			throw new Exception("Valor mayor a 10 no permitido");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public boolean equals(Object o) {
	    
	    if (this == o)
	        return true;
	    
	    if (o == null)
	        return false;
	    
	    if (getClass() != o.getClass())
	        return false;
	    
	    Carta carta = (Carta) o;
	    
	    return Objects.equals(valor, carta.valor)
	            && Objects.equals(valor, carta.valor);
	}	
	
	
	@Override
	public String toString() {
		return "Carta [name=" + nombre + ", palo=" + palo + ", valor=" + valor + "]";
	}
	
}


