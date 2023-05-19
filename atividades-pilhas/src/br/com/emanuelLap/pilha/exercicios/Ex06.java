
// EU ACHO QUE JÁ DEU DE ESTRUTURA DE DADO POR HOJE
package br.com.emanuelLap.pilha.exercicios;

import java.util.Scanner;
import java.util.Stack;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex06 {

	static Stack<Character> stack = new Stack();
	static Scanner sacn = new Scanner(System.in);
	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean checkBalancedSymbol(String expression) {

		boolean balanceado = true;
		char simbolo, topo;
		for (int i = 0; i < expression.length(); i++) {

			simbolo = expression.charAt(i);
			if (ABRE.indexOf(simbolo)>-1) {
				stack.push(simbolo);
			}
			else if(FECHA.indexOf(simbolo) > -1) {
				if(stack.isEmpty()) {
					return false;
				}else {
					topo= stack.pop();
				}
				if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
					return false;
				}
			}
		}

		while (!stack.isEmpty()) {

		}

		return true;
	}

}
