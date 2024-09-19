package br.com.Wrappers;

public class Main {

	public static void main(String[] args) {
		int i = 18;
		Integer iwrap = new Integer (i); // empacota o valor
		
		int value = iwrap.intValue();//desempacota o valor
		
		System.out.println("o valor de i:" +i);
		System.out.println(" o valor de iwrap:" + iwrap);
		System.out.println("o valor de value:" +value);
	}

}
