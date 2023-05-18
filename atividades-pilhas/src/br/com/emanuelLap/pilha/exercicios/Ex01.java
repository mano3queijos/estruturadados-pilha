package br.com.emanuelLap.pilha.exercicios;

import java.util.Scanner;

import br.com.emanuelLap.pilha.Pilha;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex01 {

	static Pilha pilha = new Pilha();
	static Pilha stack = new Pilha();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		lerNumeros();
		System.out.println(stack);
	}

	public static void lerNumeros() {

		try {
			System.out.println("Informe 10 numeros");
			for (int i = 0; i < 10; i++) {
				Integer num = scan.nextInt();
				if (verificarSeEImpar(num)) {
					stack.empilha(num);
					System.out.println("O numero era impar, empilhado");
				} else {
					System.out.println("Ele não era impar, não empilhado");
					stack.desemplilha();
				}
			}

		} catch (Exception e) {
			System.out.println("alguma coisa aconteceus");
		} finally {
			if (stack.estaVazia()) {
				System.out.println("A lits ta vazia");
			}

		}

	}

	public static boolean verificarSeEImpar(Integer num) {

		return (num % 2) == 0 ? true : false;

	}
}
