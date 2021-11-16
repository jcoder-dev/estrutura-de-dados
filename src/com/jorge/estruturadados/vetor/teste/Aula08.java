package com.jorge.estruturadados.vetor.teste;

import com.jorge.estruturadados.vetor.Vetor;

public class Aula08 {

	public static void main(String[] args) {

		Vetor letras = new Vetor(4);
		letras.adiciona("B");
		letras.adiciona("C");
		letras.adiciona("D");
		letras.adiciona("E");
		letras.adiciona("F");
		letras.adiciona("G");
		
		System.out.println(letras.toString());
		
		System.out.println(letras.tamanho());

	}

}
