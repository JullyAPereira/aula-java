package calculos;
import javax.swing.JOptionPane;

public class Impar {
	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
		if (numero % 2 == 1) {
			JOptionPane.showMessageDialog(null, "O numero é ímpar");
		}
		else {
			JOptionPane.showMessageDialog(null, "O numero é PAR ");
			
		}
		
	}
}
