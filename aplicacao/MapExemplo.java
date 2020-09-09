package aplicacao;

import java.util.Map;
import java.util.TreeMap;

public class MapExemplo {

	public static void main(String[] args) {
		
		Map<String, String> dados = new TreeMap<>();
		
		dados.put("Usuário", "Maria");
		dados.put("Email", "maria@gmail.com");
		dados.put("Celular", "99918-1978");
		
		//dados.remove("Email");
		
		for (String p : dados.keySet()) {
			System.out.println(p + " : " + dados.get(p));
		}

	}

}
