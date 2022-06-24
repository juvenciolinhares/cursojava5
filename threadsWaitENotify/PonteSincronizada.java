package threadsWaitENotify;

// 0bjetivo dessa classe: produtor execute primeiro e cada valor seja consumido imediatamente
public class PonteSincronizada implements Ponte {
	
	//atributo
	private int valor = -1;
	private boolean ocupada = false;//2- verificar se a ponte está ocupada ou não

	@Override //1- sincronizar os gets e sets: pra que eles sejam executados um de cada vez
	public synchronized void set(int valor) throws InterruptedException {
		//3-enquanto a ponte estiver ocupada, produtor aguarda
		while(ocupada) {
			System.out.println("ponte cheia, produtor deve aguarda");
			wait();//4-fazer a thread aguardar enquanto a ponte está ocupada
		}
		
		System.out.println("Produziu" + valor);
		// definir o valor:
		this.valor = valor;
		ocupada = true;//5- depois que armazena o valor em this.valor(acima) ela passa a estar ocupada. 
		notifyAll();//6-indica pra todas as threads que estão aguardando liberação(modificação) pra continuar sua execução
		
	}

	@Override //1.1
	public synchronized int get() throws InterruptedException {
		
		//7- enquanto a ponte estiver vazia, consumidor aguarda
		while(!ocupada) {
			System.out.println("ponte vazia, consumidor aguarda");//metodo get ja foi executado
			wait();//esperar a ponte ficar ocupada pra executar a leitura
		}
		
		System.err.println("Consumiu" + valor);
		ocupada = false;//8- esta vazia
		notifyAll();//9 notifica todas as threads 
		return valor;
	}

}//esperar por uma condição pra executar os gets e sets

