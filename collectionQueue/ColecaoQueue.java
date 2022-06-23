package collectionQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//instanciar a fila:
		Queue<String> fila = new LinkedList<>();
		
		//adicionar elementos à lista, esse elementos são adicionados ao final da fila
		//filas obedecem a regra FIFO: first in, first out-> primeiro que entra, primeiro que sai. 
		fila.add("Ricardo");
		fila.add("Sandra");
		fila.add("Beatriz");
		
		//nomeclatura onde se oferece um elemento à fila:
		fila.offer("Rafael");
		System.out.println(fila);
		
		//trabalhando com fila:
		
		//recuperar os elementos:
		
		//proximo elemento da fila:
		System.out.println(fila.peek());//não remove esse elemento, só consulta quem é o proximo.
		
		//tirar um elemento da fila pra poder ser atendido, remove o elemento que está em primeiro lugar:
		System.out.println(fila.poll());//retorna o elemento que removeu
		System.out.println(fila);//saiu o primeiro elemento.
		
		//instanciar um objeto LinkedList:
		
		LinkedList<String> f = (LinkedList<String>)fila;//fiz um cast
		
		//metodos LinkedList:
		f.addFirst("Caio");//coloca inicio da fila
		f.addLast("Juliana");//coloca no final da fila
		System.out.println(f);
		
		System.out.println(f.peekFirst());//retorna qual é o primeiro elemento da fila sem remover
		System.out.println(f.peekLast()); //retorna qual é o ultimo elemento da fila sem remover
		
		f.pollFirst();//remove a primeira
		f.pollLast();//remove a ultima
		System.out.println(f);
		

	}

}
