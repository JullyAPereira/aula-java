package calculos;
import javax.swing.JOptionPane;

public class Calculos {

	public static void main(String[] args) {
		int primeiroValor = Integer.parseInt (JOptionPane.showInputDialog ("primeiro valor:"));
		int segundoValor = Integer.parseInt (JOptionPane.showInputDialog ("segundo valor:"));
		
		int soma = primeiroValor + segundoValor;
		
		JOptionPane.showMessageDialog(null, "a soma dos numeros é: "+soma);
		
		int subtracao = primeiroValor - segundoValor;
		
		JOptionPane.showMessageDialog(null, "a subtração dos numeros é: "+subtracao);
		
		int multiplicacao = primeiroValor * segundoValor;
		
		JOptionPane.showMessageDialog(null, "a multiplicação dos numeros é: "+multiplicacao);
		
		int divisao = primeiroValor % segundoValor;
		
		JOptionPane.showMessageDialog(null, "a divisão dos numeros é: "+divisao);
	}

}
