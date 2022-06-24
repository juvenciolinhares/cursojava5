package threadsWaitENotify;

public interface Ponte {
	
	//definir informação que vai ser compartilhada:
	public void set(int valor) throws InterruptedException;//lança a esceção interrupção
	
	//recupera informação que vai ser compartilhada:
	public int get() throws InterruptedException;//lança a esceção interrupção
	

}
/*
 * WaitENotifyall: espere e notifique todos
 * classe produtora: escreve os dados na ponte
 * classe consumidor: le os dados da ponte
 * 
 * a classe produtora precisa receber uma ponte onde ela vai compartilhar as informações que vai produzir
 */
