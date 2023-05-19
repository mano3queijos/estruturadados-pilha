package br.com.emanuelLap.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

import br.com.emanuelLap.pilha.exercicios.domain.Livro;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex04 {

	static Stack stack = new Stack();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Inserindo elementos");

		insertElement(2);

		System.out.println("Verificando se a pilha está vazia");

		System.out.println(verificarVazia() + "\n");

		System.out.println("Espiar o topo da pilha");
		System.out.println("Livro do topo da pilha: " + stack.peek() + "\n");

		System.out.println("Desempilhar elemento");
		System.out.println("Elemento a ser desempilhad: " + stack.peek() + stack);

	}

	public static String verificarVazia() {

		return (stack.isEmpty()) ? "the stack is empty" : "the stack isn't null";

	}

	public static void insertElement(Integer num) {

		try {
			for (int i = 0; i < num; i++) {
				System.out.println("input the book's name");
				scan.next();
				String nome = scan.nextLine();
				System.out.println("input the book's isbn");
				String isbn = scan.next();
				System.out.println("input book release year");
				String anoLancamento = scan.next();
				System.out.println("input author's name");
				scan.next();
				String nomeAutor = scan.nextLine();
				stack.push(new Livro(nome, isbn, anoLancamento, nomeAutor));

			}
		} catch (Exception e) {
			System.out.println("did something happen");
		}

	}

}



