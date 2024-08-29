package celular;

public class AppPrincipal {

	public static void main(String[] args) {
		Celular celular1 = new Celular();
		//variaveis tipo float precisam de f no final
		//getters e setters 
		/*	celular1.cor = "amarelo";
			celular1.altura = 14.5f;
			celular1.largura = 9.5f;
			celular1.peso = 385.55f;
			celular1.bater_foto();
			celular1.tipo = 'a';
		*/
			celular1.setCor("amarelo");
			celular1.setAltura(14.5f);
			celular1.setAltura(9.5f);
			celular1.setPeso(385.55f); 
			celular1.bater_foto();
			celular1.setTipo('a');
		//char usa aspas simples
		
			
		//	System.out.println(celular1.cor = "Amarelo");
			System.out.println(celular1.getCor());


	}

}
