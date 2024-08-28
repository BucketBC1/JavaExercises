package linkedList;

import java.util.LinkedList;

public class DeclaracionLinkedList {
	public static void main(String[] args) {
		
		
		// se declara una linkedlist de tipo Integer.
		LinkedList<Integer> listaUno = new LinkedList<Integer>();
				
				
		/* dentro de <> se puede declarar el tipo de dato que se
		 * desee por ejemplo:
		 * 
		 * Cadenas:
		 * */
		LinkedList<String> listaDos = new LinkedList<String>();
		
		
		//Doubles
		LinkedList<Double> listaTres = new LinkedList<Double>();
		
		
		//objetos
		LinkedList<Object> listaCuatro = new LinkedList<Object>();
		
		
		//clase
		class Usuario {
			LinkedList<Usuario> listaCinco = new LinkedList<Usuario>();		
		}
		
		
		//cualquier tipo
		LinkedList lista = new LinkedList();
	}

}
