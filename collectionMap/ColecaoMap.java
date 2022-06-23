package collectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {

		// diferente das outras coleções, Map vai receber dois parametros: 1º tipo da
		// chave, 2º tipo do valor
		Map<String, String> pais = new HashMap<>();

		// metodo put, recebe dois parametros: chave e valor.
		pais.put("BR", "Brasil");
		pais.put("RU", "Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		System.out.println(pais);// chave e valor: {BR=Brasil, RU=Russia, IN=India, CN=China}

		// outras operações:
		// descobrir determinada chave:
		System.out.println(pais.containsKey("BR"));// informando qual a chave que estou buscando, retorna boolean

		// identificar se um determinado valor está presente:
		System.out.println(pais.containsValue("Estados Unidos"));// retorna false, pq nao existe

		// recuperar um conteúdo pela chave:
		System.out.println(pais.get("CN"));

		// remover um conteúdo:
		pais.remove("RU");
		System.out.println(pais);// {BR=Brasil, IN=India, CN=China} saiu a russia

		// recuperar todas as chaves do mapa:
		pais.keySet();// retorna uma coleção do tipo set: nao aceita registros duplicados
		Set<String> keys = pais.keySet();
		for (String key : keys) {
			System.out.println(key);// retorna as chaves solicitadas em pais.keySet
		}

		for (String key : keys) {
			System.out.println(key + ":" + pais.get(key));// posso ainda apresentar o valor de cada chave
		}

	}

}

/*
 * as classe map associao chaves a valores as chaves devem ser únicas, mas os valores podem conter valores duplicados
 *  posso utilizar um map para armazenar cpf;
 *   montar um dicionáio onde a palavra seja a chave e a descrição da palavra seja o valor
 * 
 */
