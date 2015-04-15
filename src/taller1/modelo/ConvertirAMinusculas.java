package taller1.modelo;

import udem.pds.taller1.io.base.Lector;
import udem.pds.taller1.io.base.LecturaException;


/**
 * Clase generada para manejar la conversión del texto leído en mayúsculas a minúsculas.
 *
 */
public class ConvertirAMinusculas extends TextDecorator{
	
	public ConvertirAMinusculas(Lector lector) {
		super(lector);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * Método sobreescrito de la clase padre. Necesario para reemplazar cada espacio
	 * que encuentre en la lectura por un underline (_)
	 * @see udem.pds.taller1.io.base.Lector#leer()
	 */
	public int leer(){
		int j = 0;
		
		// Se lee el archivo y se almacena la informacion en la variable texto.
		String texto = "Texto Leído";
		// Se usa el método convertirTextoAMinusculas para convertir la información
		// del texto de minúsculas a mayúsculas.
		convertirTextoAMinusculas(texto);

		return j;
	}

	@Override
	public void cerrar() throws LecturaException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * Método generado para realizar la conversión de texto de mayúsculas a minúsculas.
	 * 
	 * @param texto
	 * @return String
	 */
	private String convertirTextoAMinusculas(String texto) {
		
		// Se convierte el texto a minúsculas.
		texto = texto.toLowerCase();
		
		return texto;
	}
}
