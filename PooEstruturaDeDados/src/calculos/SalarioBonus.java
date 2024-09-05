package calculos;

import javax.swing.JOptionPane;

public class SalarioBonus {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salario"));
		double bonus;
		
		int tempo = Integer.parseInt (JOptionPane.showInputDialog("A quanto tempo?"));
		if (tempo>= 5) {
			bonus = salario * 0.20;
		}
		else {
			bonus = salario * 0.10;
		}
		JOptionPane.showMessageDialog(null, "O seu bonus é: R$"+bonus);
		
		

	}

	}
