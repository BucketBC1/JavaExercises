package arrayList;

import java.util.ArrayList;

public class DeclaracionArrayList {
	public static void main(String[] args) {
		
		// se declara una arraylist de tipo Integer.
		ArrayList<Integer> listaUno = new ArrayList<Integer>();
		
		
		/* dentro de <> se puede declarar el tipo de dato que se
		 * desee por ejemplo:
		 * 
		 * Cadenas:
		 * */
		ArrayList<String> listaDos = new ArrayList<String>();
		
		
		//Doubles
		ArrayList<Double> listaTres = new ArrayList<Double>();
		
		
		//objetos
		ArrayList<Object> listaCuatro = new ArrayList<Object>();
		
		
		//clase
		class Usuario {
			ArrayList<Usuario> listaCinco = new ArrayList<Usuario>();		
		}
		
		
		//cualquier tipo
		ArrayList lista = new ArrayList();
		
		
		//tamaño establecido
		ArrayList<Integer> listaSeis = new ArrayList<Integer>(10);
	
	
	}

}
