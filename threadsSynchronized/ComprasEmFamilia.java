package threadsSynchronized;

//1-implementar runnable(que vai trazer o método run)
public class ComprasEmFamilia implements Runnable {
	
	//2- objeto conta
	ContaConjunta conta = new ContaConjunta();
	
	public static void main(String[] args) {
		
		//3- criar o objeto runnable
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		
		//4-abrir várias threads ao mesmo tempo
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "Mãe").start();
		new Thread(irAsCompras, "Filho").start();
		new Thread(irAsCompras, "Babá").start();
	}

	@Override
	public void run() {
		
		//6-pegando o nome da thread: pai, mae, filho, baba
		String cliente = Thread.currentThread().getName();
		
		//5- implementar o metodo run:
		for(int i = 0; i < 5; i ++){
			conta.sacar(20, cliente);//saque
			if(conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
			
		}
	
	}

}
/*
 * 
 */
