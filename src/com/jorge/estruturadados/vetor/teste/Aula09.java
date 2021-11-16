package com.jorge.estruturadados.vetor.teste;

import com.jorge.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		Vetor letras = new Vetor(4);
		letras.adiciona("A");
		letras.adiciona("B");
		letras.adiciona("C");
		letras.adiciona("D");
		letras.adiciona("E");
		letras.adiciona("F");
		
		System.out.println(letras);
		System.out.println(letras.remover(2));
		System.out.println(letras);
		System.out.println(letras.tamanho());

		
		

	}

}
