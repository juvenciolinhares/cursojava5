package collectionQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//instanciar a fila:
		Queue<String> fila = new LinkedList<>();
		
		//adicionar elementos � lista, esse elementos s�o adicionados ao final da fila
		//filas obedecem a regra FIFO: first in, first out-> primeiro que entra, primeiro que sai. 
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.add("Beatriz");
		
		//nomeclatura onde se oferece um elemento � fila:
		fila.offer("Rafael");
		System.out.println(fila);
		
		//trabalhando com fila:
		
		//recuperar os elementos:
		
		//proximo elemento da fila:
		System.out.println(fila.peek());//n�o remove esse elemento, s� consulta quem � o proximo.
		
		//tirar um elemento da fila pra poder ser atendido, remove o elemento que est� em primeiro lugar:
		System.out.println(fila.poll());//retorna o elemento que removeu
		System.out.println(fila);//saiu o primeiro elemento.
		
		//instanciar um objeto LinkedList:
		
		LinkedList<String> f = (LinkedList<String>)fila;//fiz um cast
		
		//metodos LinkedList:
		f.addFirst("Caio");//coloca inicio da fila
		f.addLast("Juliana");//coloca no final da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst());//retorna qual � o primeiro elemento da fila sem remover
		System.out.println(f.peekLast()); //retorna qual � o ultimo elemento da fila sem remover
		
		f.pollFirst();//remove a primeira
		f.pollLast();//remove a ultima
		System.out.println(f);
		

	}

}
