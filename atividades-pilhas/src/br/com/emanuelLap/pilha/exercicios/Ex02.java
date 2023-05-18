package br.com.emanuelLap.pilha.exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex02 {

	static Stack stackEven = new Stack();
	static Stack stackOdd = new Stack();
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
					stackEven.pop();
					stackOdd.pop();
				} else if (verificarSeEImpar(num)) {
					stackEven.push(num);
					System.out.println("the number is an even number, saved on StackEven's list");
				} else {
					System.out.println("the number is an Odd number, saved on StackOdd's list");
					stackOdd.push(num);
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("something heppens");
		} finally {
			if (stackEven.isEmpty() || stackOdd.isEmpty()) {
				System.out.println("Tem lista vazia");
			}

		}

	}


	public static void desempilhaMostrando() {
		System.out.println("desempilahndo even");
		System.out.println("desempilahndo Odd");
		while (!stackEven.isEmpty() && !stackOdd.isEmpty()) {

			System.out.print(stackEven.pop() + " ");
			System.out.print(stackOdd.pop() + " ");
		}

	}

	public static boolean verificarSeEImpar(Integer num) {

		return (num % 2) == 0 ? true : false;

	}

}
