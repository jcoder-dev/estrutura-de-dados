package com.jorge.estruturadados.vetor.teste;

import com.jorge.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		
			vetor.adiciona("Jorge");
			vetor.adiciona("Madelaide");
			vetor.adiciona("Joaquina");
			vetor.adiciona("Jean Reno");
	
			
		
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor.toString());
		

	}

}
