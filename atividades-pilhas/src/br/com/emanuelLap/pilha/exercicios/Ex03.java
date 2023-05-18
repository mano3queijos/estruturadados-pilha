package br.com.emanuelLap.pilha.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.emanuelLap.pilha.Pilha;
import br.com.emanuelLap.pilha.exercicios.domain.Livro;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex03 {

	static Pilha pilha = new Pilha(20);
	static List<Livro> arrayList = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);

	public static void inserirElemento() {

		System.out.println("Informe a quantidade de livros que deseja cadastrar");
		Integer num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Informe o nome do livro");
			scan.nextLine();
			String nome = scan.nextLine();
			System.out.println("Ibnforme o isbn do livro");
			String isbn = scan.next();
				}

	}

}
