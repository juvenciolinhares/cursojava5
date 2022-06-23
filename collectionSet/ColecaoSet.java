package collectionSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		// List:
		String[] cores = {"Verde","Amarelo", "Azul", "Branco", "Azul", "Verde","Amarelo"};
		List<String> lista = Arrays.asList(cores);
		System.out.println(lista);//retorna inclusive os duplicados.
		
		//interface set:posso construir vazio ou informando uma coleção:
		Set<String> set = new HashSet<>(lista);
		System.out.println(set);//não retorna a copia.
		
		

	}

}
