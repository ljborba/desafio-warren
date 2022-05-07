package br.com.exercicio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class RunApp {

	public static void main(String[] args) throws Exception {

		Path caminho = Paths.get("C:\\Users\\natha\\OneDrive\\Documentos\\desafio_01\\primeiroProjeto\\teste.txt");

		for (Integer i = 1; i < 1_000_000; i++) {
			Integer valorDigitadoDouble = Integer.parseInt(i.toString());
			Integer valorInversoDouble = Integer.parseInt(inverso(i.toString()));
			Integer soma = valorDigitadoDouble + valorInversoDouble;

			if (soma % 2 != 0) {
				try {
					String print = i + "° volta" 
					+ "\nValor da vez: " + valorDigitadoDouble 
					+ "\nValor inverso: "+ valorInversoDouble 
					+ "\nSoma: " + soma 
					+ "\nÉ impar" +
					"\n------------------------\n";
					Files.write(caminho, print.getBytes(), StandardOpenOption.APPEND);
				} catch (Exception exception) {
					throw exception;
				}
			}
		}

	}

	public static String inverso(String valor) {
		String[] valorArray = new String[valor.length()];
		String invertida = "";

		for (Integer i = 0; i < valor.length(); i++) {
			valorArray[i] = valor.substring(i, i + 1);
		}

		for (Integer i = (valorArray.length - 1); i >= 0; i--) {
			invertida += valorArray[i];
		}

		return invertida;	
	}

}
