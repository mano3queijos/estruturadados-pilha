package br.com.emanuelLap.pilhas.teste;

import br.com.emanuelLap.pilha.Pilha;

public class Aula17 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		pilha.empilha(1);
		pilha.empilha(2);
		pilha.empilha(3);
		
		System.out.println(pilha);
		System.out.println(" desempilhando um elelemento" + pilha.desemplilha());
		System.out.println(pilha);
		
	}
}
