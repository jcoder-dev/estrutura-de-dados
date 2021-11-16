package com.jorge.estruturadados.vetor.teste;

import com.jorge.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		
		try
		{
			vetor.adiciona("Elemento 1");
			vetor.adiciona("Elemento 2");
			vetor.adiciona("Elemento 3");
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		System.out.println(vetor.tamanho());
		
		

	}

}
