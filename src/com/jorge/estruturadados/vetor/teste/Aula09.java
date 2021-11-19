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
		
		int posicao = letras.busca("E");
		if(posicao >= 0)
		{
			System.out.println("Remover o elemento " + letras.busca(posicao));
			letras.remove(posicao);
		}
		
		else
		{
			System.out.println("Posicao nao existe");
		}
		
		
		System.out.println(letras);
		System.out.println(letras.tamanho());

		
		

	}

}
