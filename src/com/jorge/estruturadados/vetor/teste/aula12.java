package com.jorge.estruturadados.vetor.teste;
import java.util.ArrayList;

public class aula12 {

	public static void main(String[] args) {
		
       ArrayList<String> arrayList = new ArrayList<String>();
       
       arrayList.add("A");
       arrayList.add("C");
       
       System.out.println(arrayList.toString());
       
       arrayList.add(1, "B");
       
       System.out.println(arrayList.toString());
       
       boolean existe = arrayList.contains("B");
       
       if(existe)
    	   System.out.println("O elemento está contido no vetor");
       else
    	   System.out.println("O elemento não está contido no vetor");


       int pos = arrayList.indexOf("A");
       
       if(pos > -1)
    	   System.out.println("O elemento existe "+ pos);
       else
    	   System.out.println("O elemento não existe "+ pos);
       
       System.out.println(arrayList.get(pos));
       
       arrayList.remove(0);
       arrayList.remove("B");
       
       arrayList.add("Jorge");
       arrayList.add("Evandro");
       
       System.out.println(arrayList.toString());
       System.out.println(arrayList.size());
       
       


	}

}
