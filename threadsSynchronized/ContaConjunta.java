package threadsSynchronized;

public class ContaConjunta {
	
	private int saldo = 100;
	
	//recuperar o valor do saldo
	public int getSaldo() {
		return saldo;
	}
	//metodo synchronized: o metodo sacae vai ser bloqueado e ninguem mais vai conseguir executar até que ele tenha sido finalizado 
	public synchronized void sacar(int valor, String cliente) {
		if(saldo >= valor) {
			int saldoOriginal = saldo;//verificado no inicio do processamento
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);//aguardando processamento 
			} catch (InterruptedException e) {
				
			}
			saldo -= valor;
			String msg = cliente + " Sacou " + valor
					+"[Saldo Origina=" + saldoOriginal 
					+" Saldo Final=" + saldo + "]";//saque realizado
			
			System.out.println(msg);
		}else {
			System.out.println("saldo insuficiente para " + cliente);
		}
		
	}

}
/*
 * o metodo sincronizado não permite que uma thread interfira em outra
 */

