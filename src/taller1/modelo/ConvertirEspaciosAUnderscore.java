package taller1.modelo;

import udem.pds.taller1.io.base.Lector;
import udem.pds.taller1.io.base.LecturaException;

/**
 * Clase generada para manejar el reemplazo de los espacios a underscore de un texto leído.
 *
 */
public class ConvertirEspaciosAUnderscore extends TextDecorator {

	public ConvertirEspaciosAUnderscore(Lector lector) {
		super(lector);
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * Método sobreescrito de la clase padre. 
	 * necesario para validar cada caracter leído y en caso que sea minúsculas pasarlo a mayúsculas
	 * @see udem.pds.taller1.io.base.LectorArchivo#leer()
	 */
	public int leer(){
		int j = 0;
		
		// Se lee el archivo y se almacena la informacion en la variable texto.
		String texto = "Texto Leído";
		// Se usa el método convertirTextoAMinusculas para convertir los espacios
		// del texto a underscores.
		convertirEspaciosAUnderscore(texto);
		
		return j;
	}

	@Override
	public void cerrar() throws LecturaException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * Método generado para realizar la conversión de espacios a underscores.
	 * 
	 * @param texto
	 * @return String
	 */
	private String convertirEspaciosAUnderscore(String texto) {
		
		// Se convierten los espacios del texto a underscores.
		texto = texto.replaceAll(" ", "_");
		
		return texto;
	}
}
