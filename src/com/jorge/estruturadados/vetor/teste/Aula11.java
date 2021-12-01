package com.jorge.estruturadados.vetor.teste;
import com.jorge.estruturadados.vetor.Lista;

public class Aula11 {

	public static void main(String[] args) {
		
		Lista<Contato> vetor = new Lista<Contato>(2);
		
		Contato c1 = new Contato("Contato 1","942523364","jorgeadao625@gmail.com");
		//vetor.adiciona("Elemento 1");
		
		vetor.adiciona(c1);
		
		System.out.println(vetor.toString()); 
		

	}

}
