package listas;

import java.util.ArrayList;
import java.util.List;

public class DeclaracionDeUnaList {
	public static void main(String[] args) {
		
		// se declara una list de tipo de string.
		List<String> listaNombres = new ArrayList<String>();
		
		/* dentro de <> se puede declarar el tipo de dato que se
		 * desee por ejemplo:
		 * 
		 * enteros:*/
		List<Integer> lista = new ArrayList<Integer>();
		
		// doubles:
		List<Double> lista2 = new ArrayList<Double>();
		
		// objetos:
		List<Object> lista3 = new ArrayList<Object>();
		
		// clase:
		class Usuario {
			List<Usuario> lista4 = new ArrayList<Usuario>();
	
		}
		
		
		// lista de cualquier tipo:
		List lista5 = new ArrayList();
		
		//tamaño establecido:
		List<String> lista6 = new ArrayList<String>(10);
	
	
	}
	

}
