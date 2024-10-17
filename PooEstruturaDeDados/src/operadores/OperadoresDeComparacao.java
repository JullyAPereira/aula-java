package br.com.smartweb.operadores;

public class OperadoresDeComparacao {
	final static double PESOPRODUTOS = 900.0;
	final static double LIMITEPESODOCAMINHO = 1000.0;
	
	
	public static void main(String[] args) {
		
		boolean cargaExcedida = PESOPRODUTOS > LIMITEPESODOCAMINHO;
		System.out.printf("Carga excedida: %b%n", cargaExcedida);
		
		System.out.println("-------------------");
		boolean cargaLiberada = PESOPRODUTOS < LIMITEPESODOCAMINHO;
		System.out.printf("Carga liberada: %b%n", cargaLiberada);
		
		System.out.println("-------------------");

		boolean cargaLiberadaIgual = PESOPRODUTOS <= LIMITEPESODOCAMINHO;
		System.out.printf("Carga liberada: %b%n", cargaLiberadaIgual);
		
		System.out.println("-------------------");
		
		boolean cargaLiberadaCaminhao = LIMITEPESODOCAMINHO <= PESOPRODUTOS;
		System.out.printf("Carga liberada: %b%n", cargaLiberadaCaminhao);
	}

}
