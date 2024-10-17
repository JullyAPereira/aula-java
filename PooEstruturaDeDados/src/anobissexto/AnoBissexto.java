package anobissexto;

import java.util.Scanner;

public class AnoBissexto {

	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//control shift o pra importar a biblioteca
		System.out.println("digite o ano:");
		int ano = entrada.nextInt();
		
		boolean anoBissexto = ((ano % 400 == 0)||(ano % 4 == 0) && (ano % 100 != 0));
		System.out.printf("É ano bissexto:"+ anoBissexto);
		
		
		entrada.close();
	}

}
