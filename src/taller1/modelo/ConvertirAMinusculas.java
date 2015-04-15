package taller1.modelo;

import udem.pds.taller1.io.base.Lector;
import udem.pds.taller1.io.base.LecturaException;


/**
 * Clase generada para manejar la conversi�n del texto le�do en may�sculas a min�sculas.
 *
 */
public class ConvertirAMinusculas extends TextDecorator{
	
	public ConvertirAMinusculas(Lector lector) {
		super(lector);
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * M�todo sobreescrito de la clase padre. Necesario para reemplazar cada espacio
	 * que encuentre en la lectura por un underline (_)
	 * @see udem.pds.taller1.io.base.Lector#leer()
	 */
	public int leer(){
		int j = 0;
		
		// Se lee el archivo y se almacena la informacion en la variable texto.
		String texto = "Texto Le�do";
		// Se usa el m�todo convertirTextoAMinusculas para convertir la informaci�n
		// del texto de min�sculas a may�sculas.
		convertirTextoAMinusculas(texto);

		return j;
	}

	@Override
	public void cerrar() throws LecturaException {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 
	 * M�todo generado para realizar la conversi�n de texto de may�sculas a min�sculas.
	 * 
	 * @param texto
	 * @return String
	 */
	private String convertirTextoAMinusculas(String texto) {
		
		// Se convierte el texto a min�sculas.
		texto = texto.toLowerCase();
		
		return texto;
	}
}
