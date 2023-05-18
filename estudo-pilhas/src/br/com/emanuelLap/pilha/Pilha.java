package br.com.emanuelLap.pilha;

public class Pilha<T> extends EstruturaEstatica<T>{

	public Pilha() {
	super();
	}

	public Pilha(Integer capacidade) {
		super(capacidade);
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	
	public T topo() {
		
//		if (this.estaVazia()) {
//			return null;
//		}
//		return this.elementos[tamanho-1];
		
		return this.estaVazia()? null : this.elementos[tamanho-1];
	}
	
	public T desemplilha() {
		
//		if (this.estaVazia()) {
//		    return null;
//		}
//		T elemento = this.elementos[tamanho - 1];
//		tamanho--;
//		return elemento;
		
		
		return this.estaVazia()? null : this.elementos[--tamanho];
	}
}
