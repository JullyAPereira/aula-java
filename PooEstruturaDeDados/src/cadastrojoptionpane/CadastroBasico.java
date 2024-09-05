package cadastrojoptionpane;

import javax.swing.JOptionPane;


public class CadastroBasico {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null,"seu nome é " + nome);
		String idade = JOptionPane.showInputDialog ("digite sua idade");
		JOptionPane.showMessageDialog(null,"eita " + idade);

	}

}
