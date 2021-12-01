package com.jorge.estruturadados.vetor;

public class VetorObjectos {
		
		private Object[] elementos;
		private int tamanho;
		
		public VetorObjectos(int capacidade) {
			
			this.elementos = new Object[capacidade];
			this.tamanho = 0;
		}
		
		
		public boolean adiciona(Object elemento) 
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
		
		public void adiciona(int posicao, Object elemento)
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
				Object elementosNovos[] = new Object[this.elementos.length * 2];
				for(int i = 0; i < this.elementos.length; i++)
				{
					elementosNovos[i] = this.elementos[i];
				}
				
				this.elementos = elementosNovos;
			}
		}
		
		public Object remover(int posicao)
		{  
			Object backup = this.elementos[posicao];
			
			for(; posicao < tamanho; posicao++)
			{
				this.elementos[posicao] = this.elementos[posicao + 1];
			}
			tamanho--;
			
			return backup;
			
		}
		  // G A B C D E F
		  // 0 1 2 3 4 5 6
		  // G A B D E F F
		public void remove(int posicao)
		{
			for(int i = posicao; i < this.tamanho - 1; i++)
			{
				this.elementos[i] = this.elementos[i + 1];
			}
			
			this.tamanho--;
		}
		
		public int tamanho()
		{
			return this.tamanho;
		}
		
		public Object busca(int posicao)
		{
			if( !(posicao >= 0 && posicao < tamanho))
			{
				throw new IllegalArgumentException("Posicao Invalida");
			}
			return this.elementos[posicao];
			
		}
		
		public int busca(Object elemento)
		{
			for(int i = 0; i < this.tamanho; i++)
			{
				if( this.elementos[i].equals(elemento))
					return i;
			}
			
			return -1;
		}
	
		
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
		

	}


