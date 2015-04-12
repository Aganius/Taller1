package taller1;

import udem.pds.taller1.io.base.Lector;
import udem.pds.taller1.io.base.LecturaException;

/*esto es una pruba jj */
public class Test {

	public static void main(String[] args){
		Lector k = new LectorAcrhivoMayusculas("hola");
		
		try {
			System.out.println(k.leer());

			k= new LectorArchivoSinEspacios("hola");
			System.out.println(k.leer());

		} catch (LecturaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

} 
