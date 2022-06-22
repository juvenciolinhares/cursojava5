package collectionIntroducao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		//objetivos: conhecer m�todos e capacidades de qualquer clsse que estenda collection
		
		/*1- estanciar uma cole��o*/
		Collection<String> c = new ArrayList<>();
		/*2- metodos*/
		//add: adiciona elementos na cole��o 
		c.add("A");
		c.add("E");
		c.add("I");
		
		//metodos que retornam algo:
		System.out.println(c.toString());//apresenta a cole��o no formato string 
		System.out.println(c.isEmpty());//verifica se a cole��o est� vazia
		System.out.println(c.contains("A"));//pesquisa a ocorrencia de determinado elemento
		
		//metodo remove: removo elementos da cole��o
		c.remove("A");
		System.out.println(c.toString());
		
		//metodos para trabalhar com grupos de elementos
		//adicinar varios elementos � cole��o:
		Collection<String> c2 = Arrays.asList("O", "U"); //Arrays.: classe utilitaria que transforma um array numa lista(cole��o)
		//metodo para adicionar: 
		c.addAll(c2);//recebe uma outra cole��o(c2) e adiciona em c.
		System.out.println(c.toString());
		
		//metodo para verificar elementos numa cole��o:
		System.out.println(c.containsAll(c2));  //verifica se em c existem todos os elementos de c2
		
		//metodo para remover todos os elementos de uma cole��o dentro de outra elementos numa cole��o:
		  c.removeAll(c2);
		  System.out.println(c.toString());
		  
		  //percorrer elementos de uma cole��o:
		  for(String string : c) {
			  System.out.println(string);
		  }
		  
		  //transformar cole��o em arrays:
		  //c.toArray();//n�o tem parametro, converte em um array de objetos
		  String [] s = c.toArray(new String[c.size()]);//metodo que recebe um tipo de parametro, um tipo de array que eu desejo retornar
		  System.out.println(Arrays.toString(s));
		  
		  //metodo que limpa toda a cole��o:
		  c.clear();
		  System.out.println(c);
		
		
		

	}

}
/*
 * cole��es:
 * estrutura de dados, interfaces e metodos para manipular dados
 * exemplos: cartas de um jogo de baralho, jogadores de um time, arraylist
 * interface collention: interfaces raiz das cole��es:
 * -set: sem duplicidades, registros �nicos;
 * classes de set: TreeSet, LinkedHasrSet e HashSet
 * -list: aceita registros duplicados , trabalha com registros ordenados
 * classes de List: Vector, ArrayList e LindekList
 * -Queue: fila de espera, resgistros s�o incluidos no final da fila e sao removidos do inicio da fila. 
 * classes de Queue:
 * PriorityQueue e linkedList
 * 
 * -interface map(n�o � filha de collection): chave-valor: representa um dicionario(palavra-> significado)
 * classesde Map:
 * Hastable, LinkedHasMap, HasMap, TreeMap,
 * 
 * 
 * -Classes utilit�rias:
 * Arrays: manipula��o de Arrays
 * Collections: manipula��o de cole��es 
 * 
 * 
 */
