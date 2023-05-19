package br.com.emanuelLap.pilha.exercicios;

import java.util.Stack;

@SuppressWarnings({ "rawtypes", "unchecked" })

public class Ex05 {

	static Stack stack = new Stack();
	
	public static void main(String[] args) {

		String word= "ADA";
		String word2 = "socorrammesubinoonibusemMarrocos";
		System.out.println("word" + "is palindrome?"+ palindromeTest(word2) );
		
	}

	public static boolean palindromeTest(String word) {

		for (int i = 0; i < word.length(); i++) {
			stack.push(word.charAt(i));
		}
		
		String inverseWord ="";
		while (!stack.isEmpty()) {
			inverseWord += stack.pop();
			
		}
		return(word.equalsIgnoreCase(inverseWord)? true: false);
	}
}
