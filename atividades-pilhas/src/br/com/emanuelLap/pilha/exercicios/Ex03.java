package br.com.emanuelLap.pilha.exercicios;

import java.util.Scanner;

import br.com.emanuelLap.pilha.Pilha;
import br.com.emanuelLap.pilha.exercicios.domain.Livro;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex03 {

	static Pilha pilha = new Pilha(20);
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Inserindo elementos");

		inserirElemento(2);

		System.out.println("Verificando se a pilha está vazia");

		System.out.println(verificarVazia() + "\n");

		System.out.println("Espiar o topo da pilha");
		System.out.println("Livro do topo da pilha: " + pilha.topo() + "\n");

		System.out.println("Desempilhar elemento");
		System.out.println("Elemento a ser desempilhad: " + pilha.topo() + pilha.desemplilha());

	}

	public static String verificarVazia() {

		return (pilha.estaVazia()) ? "A pilha de livros esta vazia" : "A pilha de livros não esta vazia";

	}

	public static void inserirElemento(Integer num) {

		try {
			for (int i = 0; i < num; i++) {
				System.out.println("Informe o nome do livro");
				scan.next();
				String nome = scan.nextLine();
				System.out.println("Ibnforme o isbn do livro");
				String isbn = scan.next();
				System.out.println("Infrome data de lançamento do livro ");
				String anoLancamento = scan.next();
				System.out.println("Informe o nome do auto");
				scan.next();
				String nomeAutor = scan.nextLine();
				pilha.empilha(new Livro(nome, isbn, anoLancamento, nomeAutor));

			}
		} catch (Exception e) {
			System.out.println("did something happen");
		}

	}

}
