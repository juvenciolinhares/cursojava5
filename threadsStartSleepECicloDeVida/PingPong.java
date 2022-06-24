package threadsStartSleepECicloDeVida;


					//1-extender thread
public class PingPong extends Thread {
	
	//2- atributos
	String palavra;
	long tempo;
	
	//3-contrutor de pingpong
	public PingPong(String palavra, long tempo ) {
		//imprimir essa palavra de tempo em tempo
		this.palavra = palavra;
		this.tempo = tempo;
		
	}
	//6-definir o metodo run
	public void run() {
		try {
			for (int i = 0; i < 5; i ++) {
				System.out.print(palavra);//imprimir a palavra 5 vezes
				Thread.sleep(tempo);//aguardar os milisegundos para imprimir de novo as palavras(esse metodo lança uma exceção)
				}
			} catch (InterruptedException e) {
				
				return;
			}
		
	}

	public static void main(String[] args) {
		
		//4-criar uma thread:
		Thread t = new Thread();
		
		/*
		 * 5-criar a classe ping e pong(as palavras que eu quero imprimir
		 *  e o tempo em milisegundos: 1500)
		 *  executar o metodo start pra que possa acontecer algo a jvm precisa encontrar um metodo run
		 *  
		 */
		new PingPong("ping", 1500).start();
		new PingPong ("PONG", 2000).start();
		
		System.out.println("Ver thread");
		
	}

}
/*
 * thread: sequencia de passos executados um de cada vez
 * multi Thread: varias threads acontecendo ao mesmo tempo (varias atividades ao mesmo tempo)
 * 
 * Objetos thread:
 * classes thread implementam runable, defini um objeto executavel(objeto com método run)
 * 
 * posso usufruir dos estado da thread:
 * -aguradar um determinado tempo; metodo sleep
 * 
 */
