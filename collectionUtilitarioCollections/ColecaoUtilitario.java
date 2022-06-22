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
		list.add("A�ai");
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
		Collections.addAll(list, "Cupua�u", "Laranja", "Laranja");//no lista list eu adicionei esses objetos que podem ser duplicados.
		System.out.println(list);
		
		//quantidade de vezes um elemento aparece na lista
		System.out.println(Collections.frequency(list, "Laranja")); 
		
		//pesquisar um conjunto de palavras:
		List<String> list2 = Arrays.asList("Acerola", "Graviola");
		boolean d = Collections.disjoint(list, list2);
		System.out.println(d);
		
		
		Collections.sort(list);//reordenar para os proximos m�todos
		
		//indice um elemento dentro da cole��o, fazer uma pesquisa:
		int indice= Collections.binarySearch(list, "Guarana"); //pesquisa na lista onde est� a palavra guaran�
		System.out.println(indice);
		System.out.println(list);
		
		//preencher toda a cole��o com uma determinda palavra:
		Collections.fill(list, "A�ai");//em todoas as posi��es ser� a palavra a�ai
		System.out.println(list);
		
		//criar uma cole��o que n�o pode ser modificada:
		Collection <String> constante = Collections.unmodifiableCollection(list);
	}

}
/*classe utilitaria collections:
 * manipula��o de todo tipo de cole��o java 
 */
