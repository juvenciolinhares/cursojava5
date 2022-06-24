package threadsWaitENotify;

import java.util.Iterator;
import java.util.Random;

//1- implementar runnable que vai gerar o metodo run
public class Consumidor implements Runnable {
	
	//6- criação do random para gerar um numero aleatório
	private Random random = new Random();

	//2- atributo
	private Ponte ponte ;
	
	//3-inicializar, receber a ponte direto no construtor
	public Consumidor (Ponte ponte) {
		this.ponte = ponte;
	}
		
	@Override //esse metodo gera informações pra serem usadas na ponte
	public void run() {
		
		//4- construir o metodo run
		
		int total = 0;//7-adicionar(a título de controle) um somatório com todos os números gerados
		for (int i = 0; i < 5; i++) {
			
			try {
			Thread.sleep(random.nextInt(3000));//5-definir um periodo de 0 a 3 segundos, preciso criar um random
			 
			 total =+ponte.get();//4- armazenar o valor do for
			//8- apresentar o total da classe produtora
			System.err.println("\t" + total);
			}catch (InterruptedException e ) {};
			
		}
		
		
	}

}
