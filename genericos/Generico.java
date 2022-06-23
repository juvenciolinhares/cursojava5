package genericos;

import java.util.ArrayList;

/*defino o tipo entre <>, E significa elemento(qualquer elemento)*/
public class Generico<E> {
	
	//Elemento generico informado no construtor da classe:
	E elemento;
	
	//manipular esse elemento(cria metodos get set):
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	public E getElemento() {
		return elemento;
	}
	
	/*caracter coringa:
	 * permitem espcificar parametros que atuam como supertipo ou subtipos parametrizados exemplo:
	 */
	
	//construir um metodo que utilize como parametros um conjunto de subtipos da classe number:
						//qualquer tipo que extenda numer ou o proprio number
	public double soma (ArrayList<? extends Number> lista) {
		//a partir de agora posso receber um arrayList de int, float, double ou de number
		
		double total = 0;
			for (Number number : lista) {
				total += number.doubleValue();
			}
		return 0;
		
	}

	
//	especificar elementos que são pai de determinado tipo:
//									//utiliza super no lugar de extends
//	public double soma (ArrayList<? super Number> ...) {
//		return null;
//	}
//		

	public static void main(String[] args) {
		
		//preciso informar o tipo de dados 
		Generico<String> g = new Generico<>();//
		
		//pode receber qualquer tipo: string, inteiro...
		g.setElemento("Lago Paranoá");//String
		//g.setElemento(123456);//não aceita por que o tipo que esta sendo usado é String
				
		g.getElemento().toUpperCase();
		/*outro problema:
		 * caso misturasse por exemplo String e int,
		 *  se eu quisesse acessar um metodo especifico de um ou outro, a aplicação quebraria
		 */
		
	}

}
/*
 * valores genericos: valores generalizados, gerais, que não conheço o tipo de dados que será usado.
 * utilizamos genericos em coleções java:
 * sempre que se declara uma coleção, é preciso determinar o tipo de dados que a coleção vai manipular
 * 
 * como era antes dos genericos?
 * tipo Object, por que object é o tipo mais genérico de dado dentro dao java 
 * não existia uma forma muito forte para definir tipos de dados genericos pros metodos.
 * 
 * 
 * forma antiga
// * //criação de um objeto genérico:
//	Object elemento;
//	
//	//manipular esse elemento(cria metodos get set):
//	
//	public void setElemento(Object elemento) {
//		this.elemento = elemento;
//	}
//	public Object getElemento() {
//		return elemento;
//	}
//
//	public static void main(String[] args) {
//		
//		Generico g = new Generico();
//		
//		//pode receber qualquer tipo: string, inteiro...
//		g.setElemento("Lago Paranoá");//String
//		g.setElemento(123456);//inteiro
//		
//		/*não dá pra acessar metodos especificos de cada tipo,
//		 *  por exemplo, não dá pra acessar um toUppercase para string
//		 *  para realizar esse tipo de operação eu precisaria de um cast :
//		 */
//		String e = (String) g.getElemento();
//		e.toUpperCase();
//		
//		/*outro problema:
//		 * caso misturasse por exemplo String e int,
//		 *  se eu quisesse acessar um metodo especifico de um ou outro, a aplicação quebraria
//		 */
