package com.jorge.estruturadados.vetor.teste;
import com.jorge.estruturadados.vetor.VetorObjectos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjectos vetor = new VetorObjectos(4);
		
		
		Contato c1 = new Contato("Jorge", "942523367", "jorge@gmail.com");
		Contato c2 = new Contato("Mad", "942523361", "mad@gmail.com");
		Contato c3 = new Contato("Laide", "94252337", "Laide@gmail.com");
		Contato c4 = new Contato("Laide", "94252337", "Laide@gmail.com");
 
         vetor.adiciona(c1);
         vetor.adiciona(c2);
         vetor.adiciona(c3);
		
		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);

	   int posicao = vetor.busca(c3);
	   
	   if(posicao > -1)
	   {
		   System.out.println("remover a posicao: " + posicao);
		   vetor.remove(posicao);
	   }
	   else
	   {
		   System.out.println("Objecto nao encontrado ");

	   }
	   
		System.out.println(vetor);


        
	}

}
