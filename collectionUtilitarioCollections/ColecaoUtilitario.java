package collectionUtilitarioCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		//criar uma lista:
		List<String> list = new ArrayList<>();
		
		//lista de frutas:
		list.add("Guarana");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Açai");
		list.add("Banana");
		System.out.println(list);
		
		//metodos de  collections:
		
		//ordena em ordem alfabetica
		Collections.sort(list);
		System.out.println(list);
		
		//inverter a ordem dos dados:
		Collections.reverse(list);
		System.out.println(list);
		
		//embaralhar a ordem dos dados:
		Collections.shuffle(list);//todo nova chamada ele embaralhada novamente
		System.out.println(list);
		
		//adicionar elementos extras:
		Collections.addAll(list, "Cupuaçu", "Laranja", "Laranja");//no lista list eu adicionei esses objetos que podem ser duplicados.
		System.out.println(list);
		
		//quantidade de vezes um elemento aparece na lista
		System.out.println(Collections.frequency(list, "Laranja")); 
		
		//pesquisar um conjunto de palavras:
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		boolean d = Collections.disjoint(list, list2);
		System.out.println(d);
		
		
		Collections.sort(list);//reordenar para os proximos métodos
		
		//indice um elemento dentro da coleção, fazer uma pesquisa:
		int indice= Collections.binarySearch(list, "Guarana"); //pesquisa na lista onde está a palavra guaraná
		System.out.println(indice);
		System.out.println(list);
		
		//preencher toda a coleção com uma determinda palavra:
		Collections.fill(list, "Açai");//em todoas as posições será a palavra açai
		System.out.println(list);
		
		//criar uma coleção que não pode ser modificada:
		Collection <String> constante = Collections.unmodifiableCollection(list);
	}

}
/*classe utilitaria collections:
 * manipulação de todo tipo de coleção java 
 */
