package com.jorge.estruturadados.vetor.teste;

import com.jorge.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {
		
		Vetor letras = new Vetor(10);
		letras.adiciona("B");
		letras.adiciona("C");
		letras.adiciona("D");
		letras.adiciona("E");
		letras.adiciona("F");
		letras.adiciona("G");
		
	
		System.out.println(letras.toString());

		letras.adiciona(0,"A");
		
		System.out.println(letras.toString());
		
		letras.adiciona(3,"L");
		
		System.out.println(letras.toString());


		

	}

}
