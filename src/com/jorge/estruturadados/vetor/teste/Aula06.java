package com.jorge.estruturadados.vetor.teste;

import com.jorge.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor cursos = new Vetor(10);
		
		cursos.adiciona("Informatica");
		cursos.adiciona("Telecomunicacoes");
		cursos.adiciona("Petroleos");
		
	    System.out.println(cursos.busca("Informatica"));
	    System.out.println(cursos.busca("Telecomunicacoes"));
	    System.out.println(cursos.busca("Informa"));


	}

}
