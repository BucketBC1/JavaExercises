package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class EditarLinkedList {
	public static void main(String[] arrgs) {
		
		LinkedList<String> listaNombres = new LinkedList<String>();
		//add:
		listaNombres.add("Jhon");
		listaNombres.add("Alejandro");
		listaNombres.add("Andres");
		listaNombres.add("Camilo");
		listaNombres.add("Johnathan");
		listaNombres.add("Sergio");
		System.out.println("Add method:");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);
		
		
		//add usando un indice:
		listaNombres.add(6, "Yulieth");
		listaNombres.add(7, "Camila");
		listaNombres.add(8, "Melanie");
		listaNombres.add(9, "Isabel");
		listaNombres.add(10, "Andrea");
		listaNombres.add(11, "Rosa");
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("Add method con indice:");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);
		
		
		//addAll: (Agregar lista)
		LinkedList<String> nombresNuevos = new LinkedList<String>();
		nombresNuevos.add("Julio");
		nombresNuevos.add("Miller");
		nombresNuevos.add("Yaned");
		nombresNuevos.add("Enrique");
		listaNombres.addAll(nombresNuevos);
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("Agregar nueva lista:");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);
		
		
		//addAll (con indice)
		LinkedList<String> numerosIniciales = new LinkedList<String>();
		numerosIniciales.add("1");
		numerosIniciales.add("2");
		numerosIniciales.add("3");
		LinkedList<String> numerosFinales = new LinkedList<String>();
		numerosFinales.add("19");
		numerosFinales.add("20");
		numerosFinales.add("21");
		listaNombres.addAll(0, numerosIniciales);
		listaNombres.addAll(19, numerosFinales);
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("numeros iniciales y finales");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);

		
		//addFirts (Agrega al principio)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		listaNombres.addFirst("primero");
		System.out.println("AddFirts method:");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);
		
		
		//addLast (Agrega al final)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		listaNombres.addLast("ultimo");
		System.out.println("addLast method");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);
		
		
		//set (atualiza un indice de la lista apartir de su posicion)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		listaNombres.set(11, "valor cambiado");
		System.out.println("set method");
		System.out.println("El tamaño de la LinkedList es: " + listaNombres.size());
		System.out.println(listaNombres);
		
		
		//get (llamar indice)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("get method");
		System.out.println("Indice 18: " + listaNombres.get(18));
		
		
		//getFirst (llama al primero)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("getFirst method");
		System.out.println("El primer valor es: " + listaNombres.getFirst());
		
		
		//getLast (llama el ultimo)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("getLast method");
		System.out.println("El ultimo valor es: " + listaNombres.getLast());
		
		
		//contains method (true si contiene un valor otorgado, de lo contrario false)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("contains method");
		System.out.println("El valor 'Johnathan' esta dentro de la lista: " + listaNombres.contains("Johnathan"));
		System.out.println("El valor 'pipas' esta dentro de la lista: " + listaNombres.contains("pipas"));
		
		
		//contains dentro sentencias
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("contains dentro de una condicional");
		String valor = "Alejandro";
		if(listaNombres.contains(valor)) {
			System.out.println("El valor " + valor + " se encuentra dentro de la lista, dentro del index " + listaNombres.indexOf(valor) + ".");
		}else {
			System.out.println("El valor " + "'" + valor + "'" + " no esta en la lista");
		}
		
		
		//clear method (limpia toda una lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("clear method");
		System.out.println("'nombresNuevos' antes de clear method: " + nombresNuevos);
		nombresNuevos.clear();
		System.out.println("'nombresNuevos' despues de clear method: " + nombresNuevos);
		System.out.println("'listaNombres' despues de clear method en la lista 'nombresNuevos': " + listaNombres + ": el tamaño actual de la lista es " + listaNombres.size() + ".");
		
		
		//isEmpty method (si esta vacia 'true' de lo contrario 'false')
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("isEmpty method");
		System.out.println("la lista 'nombresNuevos' esta vacia: " + nombresNuevos.isEmpty());
		System.out.println("la lista 'listaNombres' esta vacia: " + listaNombres.isEmpty());
		
		
		//remove method
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("remove method sin pasar algún parametro (elimina el primer valor 'primero')");
		listaNombres.remove();
		System.out.println(listaNombres + "" + listaNombres.size());
		System.out.println("remove method con el parametro 'Rosa'");
		listaNombres.remove("Rosa");
		System.out.println(listaNombres + "" + listaNombres.size());
		System.out.println("remove method con el indice a eliminar (14)");
		System.out.println("el indice 14 es: " + listaNombres.get(14));
		listaNombres.remove(14);
		System.out.println(listaNombres + "" + listaNombres.size());
		
		
		//offer method (agrega el valor otorgado de ultimas en la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("offer method (agrega el valor otorgado, de ultimas en la lista)");
		nombresNuevos.offer("offer1");
		nombresNuevos.offer("offer2");
		nombresNuevos.offer("offer3");
		System.out.println(nombresNuevos);
		
		
		//offerFirst (agrega de primeras, un valor a la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		nombresNuevos.offerFirst("offerFirst");
		System.out.println(nombresNuevos + "" + nombresNuevos.size());
		
		
		//peek method (recupera pero no elimina el primer elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("peek method (recupera pero no elimina el primer elemento de la lista)");
		System.out.println("listaNombres.peek(): " + listaNombres.peek()); //1
		
		
		//peekFirst method (recupera pero no elimina el primer elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("peekFirst (recupera pero no elimina el primer elemento de la lista)");
		System.out.println("listaNombres.peekFirst(): " + listaNombres.peekFirst());
		
		
		//peekLast method (recupera pero no elimina el primer elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("peekLast (recupera pero no elimina el ultimo elemento de la lista)");
		System.out.println("listaNombres.peekLast(): " + listaNombres.peekLast());
		
		
		//poll method (recupera y elimina el primer elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("poll (recupera y elimina el primer elemento de la lista)");
		System.out.println("listaNombres.poll(): " + listaNombres.poll());
		System.out.println("listaNombres: " + listaNombres);
		
		
		//pollFirst method (recupera y elimina el primer elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("pollFirst (recupera y elimina el primer elemento de la lista)");
		System.out.println("listaNombres.pollFirst(): " + listaNombres.pollFirst());
		System.out.println("listaNombres: " + listaNombres);
		
		
		//pollLast method (recupera y elimina el ultimo elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("pollLast (recupera y elimina el ultimo elemento de la lista)");
		System.out.println("listaNombres.pollLast(): " + listaNombres.pollLast());
		System.out.println("listaNombres: " + listaNombres);
		
		
		//pop method (recupera y no elimina el primer elemento de la lista)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("pop (recupera y no elimina el primer elemento de la lista)");
		System.out.println("listaNombres.pop(): " + listaNombres.pop());
		System.out.println("listaNombres: " + listaNombres);
		
		
		//push method (recibe únicamente el dato que se desea guardar, el índice asignado es el 0, así que queda en la primera posición, por ende, las demás posiciones aumentan en 1, en caso de que existan.)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("push (recibe únicamente el dato que se desea guardar, el índice asignado es el 0, así que queda en la primera posición, por ende, las demás posiciones aumentan en 1, en caso de que existan.)");
		listaNombres.push("UnoUsandoPush");
		System.out.println("listaNombres: " + listaNombres);
		
		
		//listIterator method (crea una variable de iteracion de listas para recorrerlas en el orden en el que se encuentran almacenadas)
		System.out.println();
		System.out.println(" --------- / / / --------- ");
		System.out.println("listIterator method (crea una variable de iteracion de listas para recorrerlas en el orden en el que se encuentran almacenadas)");
		ListIterator<String> listaIterable = listaNombres.listIterator();
		
		int valorIterable = 0;
		while(listaIterable.hasNext()) {
			System.out.println("- Valor " + valorIterable + ": " +listaIterable.next());
			valorIterable++;
		}
		
	}

}
