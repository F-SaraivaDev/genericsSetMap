package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entidades.LogEntrada;

public class ProgramaLog {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o caminho completo do arquivo: ");
		String caminho = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			Set<LogEntrada> log = new HashSet<LogEntrada>();
			
			String linha = br.readLine();
			
			while(linha != null){
				String campos[] = linha.split(" ");
				String userName = campos[0];
				Date momento = Date.from(Instant.parse(campos[1]));
				
				log.add(new LogEntrada(userName, momento));
				
				linha = br.readLine();
			}
			
			System.out.println("Total de usuários: " + log.size());

		} catch (IOException erro) {
			System.out.println("Erro: " + erro.getMessage());
		}

		sc.close();

	}
}
