package com.jorge.estruturadados.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento)
	{
		for(int i = 0; i < this.elementos.length; i++)
		{
			if(this.elementos[i] == null)
			{
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*public void adiciona(String elemento) throws Exception
	{
		if(this.tamanho < this.elementos.length)
		{
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		
		else
		{
			throw new Exception("O vetor esta cheio, nao eh possivel adicionar mais elementos");
		}
		*/
	
	public boolean adiciona(String elemento) 
	{
		this.aumentaCapacidade();

		if(this.tamanho < this.elementos.length)
		{
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
		
	      
	}
	
	public void adiciona(int posicao, String elemento)
	{
		this.aumentaCapacidade();
		
		if( !(posicao >= 0 && posicao < tamanho))
		{
			throw new IllegalArgumentException("Posicao Invalida");
		}
		
		
		for(int i = tamanho - 1 ; i >= posicao; i--)
		{
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		tamanho++;
		
	}
	
	private void aumentaCapacidade()
	{
		if(this.tamanho == this.elementos.length)
		{
			String elementosNovos[] = new String[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++)
			{
				elementosNovos[i] = this.elementos[i];
			}
			
			this.elementos = elementosNovos;
		}
	}
	
	public String remover(int posicao)
	{   String backup = this.elementos[posicao];
		for(; posicao < tamanho; posicao++)
		{
			this.elementos[posicao] = this.elementos[posicao + 1];
		}
		
		tamanho--;
		
		return backup;
	}
	
	public int tamanho()
	{
		return this.tamanho;
	}
/*
	@Override
	public String toString() {
		return Arrays.toString(elementos);
	}
	*/
	/*public String toString()
	{
		String s = "[";
		
		for(int i = 0; i < this.tamanho - 1; i++)
		{
			s += this.elementos[i];
			s += ",";
		}
		
		if( this.tamanho > 0)
		{
			s += this.elementos[ this.tamanho - 1 ];
		}
		
		s += "]";
		
		return s;
		
	}*/
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho - 1; i++)
		{
			s.append(this.elementos[i]);
			s.append(",");
		}
		
		if( this.tamanho > 0)
		{
			s.append(elementos[ this.tamanho - 1 ]);
		}
		
		s.append("]");
		
		return s.toString();
		
	}
	
	public String busca(int posicao)
	{
		if( !(posicao >= 0 && posicao < tamanho))
		{
			throw new IllegalArgumentException("Posicao Invalida");
		}
		return this.elementos[posicao];
		
	}
	
	public int busca(String elemento)
	{
		for(int i = 0; i < this.tamanho; i++)
		{
			if( this.elementos[i].equals(elemento))
				return i;
		}
		
		return -1;
	}
	
	
	

}
