package list;

import java.util.ArrayList;
import java.util.List;

public class AgregarElementos {
	public static void main(String[] args) {
		
		
		//add:
		List<String> lista1 = new ArrayList<String>();
		lista1.add("Jhon");
		lista1.add("Alejandro");
		lista1.add("Arias");
		lista1.add("Wilches");
		System.out.println(lista1);
		
		
		//agregar con un indice o posicion;
		List<String> listaDos = new ArrayList<String>();

		
		listaDos.add(0, "colombia");
		listaDos.add(1, "venezuela");
		listaDos.add(2, "peru");
		listaDos.add(3, "ecuador");
		System.out.println(listaDos.size()); //8 
		System.out.println(listaDos); // [ecuador, colombia, peru, venezuela, venezuela, peru, colombia, ecuador]
		
		
		//metodo add list (Agregar una lista dentro de otra):
		List<String> lista3 = new ArrayList<String>();
		lista3.add("Jhon");
		lista3.add("Alejandro");
		
		List<String> listaNueva = new ArrayList<String>();
		listaNueva.add("Arias");
		listaNueva.add("Wilches");
		
		lista3.addAll(listaNueva);
		
		System.out.println(lista3); //[Jhon, Alejandro, Arias, Wilches]
		
		
		//metodo add list con indice (recibe todos los elementos de una lista nueva en una posicion especifica):
		List<String> listaNumeros = new ArrayList<String>();
		listaNumeros.add(0, "0");
		listaNumeros.add(1, "1");
		listaNumeros.add(2, "2");
		
		List<String> listaNumeros2 = new ArrayList<String>();
		listaNumeros2.add("3");
		listaNumeros2.add("4");
		listaNumeros2.add("5");
		
		// listaNumeros.addAll(listaNumeros2); [0, 1, 2, 3, 4, 5]
		//listaNumeros.addAll(0, listaNumeros2); [0, 1, 2, 3, 4, 5]
		// listaNumeros.addAll(1, listaNumeros2); [0, 3, 4, 5, 1, 2]

	
	}

}
