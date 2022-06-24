package threadsRunnable;
								
							//1- implementar a interface runnable(não preciso)
public class PingPongRunnable implements Runnable {
	
	//2-atributos:
	String palavra;
	long tempo;

	// 3-contrutor de pingpong
	public PingPongRunnable(String palavra, long tempo) {
		// imprimir essa palavra de tempo em tempo
		this.palavra = palavra;
		this.tempo = tempo;

	}

	//6-definir o metodo run
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(palavra);// imprimir a palavra 5 vezes
				Thread.sleep(tempo);// aguardar os milisegundos para imprimir de novo as palavras
			}
		} catch (InterruptedException e) {

			return;
		}

	}

	public static void main(String[] args) {

		//4-objeto runnable	
		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("PONG", 2000);
		
		//4-nova thread com o runnable definido entre parentese(ping,"ping" ) e vou startar a thread
		new Thread(ping,"ping" ).start();
		new Thread(pong,"pong" ).start();
		
		System.out.println("Ver Threads");

	}

}
/*
 * toda thread implementa runnable que define um método executavel
 * objetos runnable podem ser utilizados no lugar de threads.
 */
