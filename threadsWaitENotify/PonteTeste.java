package threadsWaitENotify;

import javax.xml.stream.events.StartDocument;

public class PonteTeste {

	public static void main(String[] args) {
		
		//1- criar uma ponta pra ser compartilhada pelas classe produtor e consumidor
		Ponte ponte = new PonteSincronizada();
		
		//2- criar threads dos produtores e consumidores
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();

	}

}
/*
 * o correto é que quando uma informação seja produzida, ela seja consumida logo em seguida
 *  e o saldo de produção e consumo seja exatamente igual
 */
