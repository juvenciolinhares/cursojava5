package collectionList;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//adicionar elementos com duplica��o:
		list.add("futebol");
		list.add("Basquete");
		list.add("Tenis");
		list.add("Volei");
		list.add("Nata��o");
		list.add("HOckey");
		list.add("Boxe");
		list.add("futebol");//elemento duplicado 
		System.out.println(list);//essa duplica�� eu nao consegueria numa interface set, por exemplo.
		
		//lista os elementos:
		for(int i = 0; i < list.size(); i ++) {
			String letra =  list.get(i);//recuperar elemento na posi��o de i
			
			//reatribuir esse elemento na mesma posi��o dele:
			list.set(i, letra.toUpperCase());
		}
		
		System.out.println(list);
		
		//metodo indexOf: localiza um elemento:
		System.out.println(list.indexOf("BOXE")); 
		
		//encontrar uma sublista:
		System.out.println(list.subList(2, 4));//informar os indices da sublista
		
		//remover sublista:
		list.subList(2, 4).clear();
		System.out.println(list);//remove da lista principal

	}

}
/*interface list:
 *  pode ser chama de sequencia (cole��o ordenadas que pode conter elementos duplicados)
 *  tem todos os metodos de collection e mais alguns outros pra manipular os elementos pelos �ndices(parecido com array)
 */