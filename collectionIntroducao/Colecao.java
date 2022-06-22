package collectionIntroducao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		//objetivos: conhecer métodos e capacidades de qualquer clsse que estenda collection
		
		/*1- estanciar uma coleção*/
		Collection<String> c = new ArrayList<>();
		/*2- metodos*/
		//add: adiciona elementos na coleção 
		c.add("A");
		c.add("E");
		c.add("I");
		
		//metodos que retornam algo:
		System.out.println(c.toString());//apresenta a coleção no formato string 
		System.out.println(c.isEmpty());//verifica se a coleção está vazia
		System.out.println(c.contains("A"));//pesquisa a ocorrencia de determinado elemento
		
		//metodo remove: removo elementos da coleção
		c.remove("A");
		System.out.println(c.toString());
		
		//metodos para trabalhar com grupos de elementos
		//adicinar varios elementos à coleção:
		Collection<String> c2 = Arrays.asList("O", "U"); //Arrays.: classe utilitaria que transforma um array numa lista(coleção)
		//metodo para adicionar: 
		c.addAll(c2);//recebe uma outra coleção(c2) e adiciona em c.
		System.out.println(c.toString());
		
		//metodo para verificar elementos numa coleção:
		System.out.println(c.containsAll(c2));  //verifica se em c existem todos os elementos de c2
		
		//metodo para remover todos os elementos de uma coleção dentro de outra elementos numa coleção:
		  c.removeAll(c2);
		  System.out.println(c.toString());
		  
		  //percorrer elementos de uma coleção:
		  for(String string : c) {
			  System.out.println(string);
		  }
		  
		  //transformar coleção em arrays:
		  //c.toArray();//não tem parametro, converte em um array de objetos
		  String [] s = c.toArray(new String[c.size()]);//metodo que recebe um tipo de parametro, um tipo de array que eu desejo retornar
		  System.out.println(Arrays.toString(s));
		  
		  //metodo que limpa toda a coleção:
		  c.clear();
		  System.out.println(c);
		
		
		

	}

}
/*
 * coleções:
 * estrutura de dados, interfaces e metodos para manipular dados
 * exemplos: cartas de um jogo de baralho, jogadores de um time, arraylist
 * interface collention: interfaces raiz das coleções:
 * -set: sem duplicidades, registros únicos;
 * classes de set: TreeSet, LinkedHasrSet e HashSet
 * -list: aceita registros duplicados , trabalha com registros ordenados
 * classes de List: Vector, ArrayList e LindekList
 * -Queue: fila de espera, resgistros são incluidos no final da fila e sao removidos do inicio da fila. 
 * classes de Queue:
 * PriorityQueue e linkedList
 * 
 * -interface map(não é filha de collection): chave-valor: representa um dicionario(palavra-> significado)
 * classesde Map:
 * Hastable, LinkedHasMap, HasMap, TreeMap,
 * 
 * 
 * -Classes utilitárias:
 * Arrays: manipulação de Arrays
 * Collections: manipulação de coleções 
 * 
 * 
 */
