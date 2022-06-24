package threadsWaitENotify;

//1-implementa a interface ponte:
public class PonteNaoSincronizada implements Ponte {
	
	//2 atributo:
	private int valor = -1;

	@Override //quem executa esse método é a classe produtora
	public void set(int valor) throws InterruptedException {
		System.out.println("Produziu" + valor);
		this.valor = valor;//3-adicionar o valor informado
		
		
	}

	@Override //quem executa esse método é a classe consumidora
	public int get() throws InterruptedException {
		System.err.println("Consumiu" + valor);
		
		return valor;
	}

}
