package br.com.exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RunAppDois {

	public static void main(String[] args) {
		List<Integer> temposChegadas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Limite: ");
		Integer limiteAlunos = scanner.nextInt();
		String continuar = "";

		do {
			System.out.print("Tempo de chegada: ");
			Integer tempoChegada = scanner.nextInt();
			temposChegadas.add(tempoChegada);

			System.out.print("Deseja continuar?(s/n)");
			continuar = scanner.next();
		} while (continuar.equals("s"));

		Integer alunosNormal = 0;
		for (Integer tempoChegada : temposChegadas) {
			if (tempoChegada <= 0) {
				alunosNormal++;
			}
		}

		if (alunosNormal >= limiteAlunos) {
			System.out.println("Aula normal");
		} else {
			System.err.println("Aula cancelada");
		}
	}
}
