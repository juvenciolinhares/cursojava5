package threadsWaitENotify;

public interface Ponte {
	
	//definir informa��o que vai ser compartilhada:
	public void set(int valor) throws InterruptedException;//lan�a a esce��o interrup��o
	
	//recupera informa��o que vai ser compartilhada:
	public int get() throws InterruptedException;//lan�a a esce��o interrup��o
	

}
/*
 * WaitENotifyall: espere e notifique todos
 * classe produtora: escreve os dados na ponte
 * classe consumidor: le os dados da ponte
 * 
 * a classe produtora precisa receber uma ponte onde ela vai compartilhar as informa��es que vai produzir
 */
