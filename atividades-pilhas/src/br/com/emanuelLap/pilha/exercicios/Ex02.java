package br.com.emanuelLap.pilha.exercicios;

import java.util.Scanner;

import br.com.emanuelLap.pilha.Pilha;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex02 {

	static Pilha stackEven = new Pilha();
	static Pilha stackOdd = new Pilha();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		lerNumeros();
		desempilhaMostrando();
	}

	public static void lerNumeros() {

		try {
			System.out.println("Informe 10 numeros");
			for (int i = 0; i < 10; i++) {
				Integer num = scan.nextInt();
				if (num == 0) {
					stackEven.desemplilha();
					stackOdd.desemplilha();
				} else if (verificarSeEImpar(num)) {
					stackEven.empilha(num);
					System.out.println("the number is an even number, saved on StackEven's list");
				} else {
					System.out.println("the number is an Odd number, saved on StackOdd's list");
					stackOdd.empilha(num);
				}
			}

		} catch (Exception e) {
			System.out.println("something heppens");
		} finally {
			if (stackEven.estaVazia() || stackOdd.estaVazia()) {
				System.out.println("Tem lista vazia");
			}

		}

	}


	public static void desempilhaMostrando() {
		System.out.println("desempilahndo even");
		System.out.println("desempilahndo Odd");
		while (!stackEven.estaVazia() && !stackOdd.estaVazia()) {

			System.out.print(stackEven.desemplilha() + " ");
			System.out.print(stackOdd.desemplilha() + " ");
		}

	}

	public static boolean verificarSeEImpar(Integer num) {

		return (num % 2) == 0 ? true : false;

	}

}
