package taller1.modelo;

import udem.pds.taller1.io.base.Lector;

/**
 * Clase que se genera basada en el patr�n Decorator, de esta clase pueden
 * heredar las funcionalidades agregadas a la aplicaci�n.
 *
 */
public abstract class TextDecorator implements Lector {
	
	protected Lector lector;

	public TextDecorator() {
		super();
	}

}
