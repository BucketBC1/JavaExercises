package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EditarListas {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add(0, "colombia");
		lista.add(1, "chile");
		lista.add(2, "argentina");
		lista.add(3, "venezuela");
		
		
		//set: (otorgar valores dependiendo su indice);
		lista.set(2, "mejor nada");
		System.out.println(lista);  //[colombia, chile, mejor nada, venezuela]
		
		
		//get: (recuperar valores de una lista)
		System.out.println(lista.get(2)); // mejor nada
		System.out.println(lista.get(3)); // venezuela
		
		
		//size: (devuelve el tamaño de la lista)
		System.out.println(lista.size()); // 4
		
		
		/*contains: (recibe un valor del mismo tipo y determina si existe o no dentro de la lista. 
		 * Devuelve true si existe, y falso en caso contrario.)
		 */
		System.out.println(lista.contains("chile")); //true
		System.out.println(lista.contains("bolivia")); //false
		/* Este metodo puede ser usado dentro condicionales por el tipo
		 * booleano de retorno.
		 */
		if(lista.contains("colombia")) {
			System.out.println("la cadena esta dentro de la lista");
		} else {
			System.out.println("la cadena NO esta dentro de la lista");
		}
		
		
		//clear: (limpia todos los datos de la lista)
		//lista.clear();
		//lista.size(); // 0
		
		
		//isEmpty: (retorna true si la lista esta vacia, de lo contrario false)
		if(lista.isEmpty()) {
			System.out.println("la lista esta vacia");
		}else {
			System.out.println("la lista no esta vacia");
		}
		
		
		//remove por indice: (remueve el indice ingresado)
		lista.remove(3);
		System.out.println(lista); //[colombia, chile, mejor nada]
		
		
		//remove por valor: (remueve el valor ingresado)
		lista.remove("mejor nada");
		System.out.println(lista); //[colombia, chile]
		
		
		/*indexOf(): (devuelve el indice de un dato especificado en el 
		 * método, en caso de que exista en la lista.)		
		 */
		System.out.println(lista.indexOf("colombia")); //Posición 0
		
		
		/*iterator: (crea una variable de iteracion de listas para recorrer la 
		 * mismas en el orden en el que se encuentran almacenadas)
		 */
		Iterator<String> listaIterable = lista.iterator();
		int iteracion = 0;
		while(listaIterable.hasNext()) {
			iteracion += 1; 
			System.out.println("Iteración " + iteracion + ": " + listaIterable.next());
			//Iteración 1: colombia
			//Iteración 2: chile
		}
	}
}
