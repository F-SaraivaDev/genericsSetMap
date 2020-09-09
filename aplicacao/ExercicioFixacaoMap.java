package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Na contagem de votos de uma eleição, são gerados vários registros
 de votação contendo o nome do candidato e a quantidade de votos
 (formato .csv) que ele obteve em uma urna de votação. Você deve
 fazer um programa para ler os registros de votação a partir de um
 arquivo, e daí gerar um relatório consolidado com os totais de cada
 candidato.
 */

public class ExercicioFixacaoMap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votos = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String linha = br.readLine();
			while (linha != null) {

				String[] campos = linha.split(",");
				String nome = campos[0];
				int count = Integer.parseInt(campos[1]);

				if (votos.containsKey(nome)) {
					int votosSoFar = votos.get(nome);
					votos.put(nome, count + votosSoFar);
				} else {
					votos.put(nome, count);
				}

				linha = br.readLine();
			}

			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		sc.close();
	}

}
