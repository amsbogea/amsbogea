package entrada_de_dados;

import javax.swing.JOptionPane;

public class Entrada_de_dados {

	public static void main(String[] args) {

		/*
		 * JOptionPane.showInputDialog = Exibe uma caixa de dialogo na tela e aguarda
		 * interação do usuario
		 */
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

		/* Double.parseDouble converte tipo STRING para tipo DOUBLE */
		double carro_numero = Double.parseDouble(carros);
		double pessoas_numero = Double.parseDouble(pessoas);

		/* (int) = converte tipo de D para tipo INT */
		int divisao = (int) (carro_numero / pessoas_numero);

		double resto = carro_numero % pessoas_numero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {
			/*
			 * JOptionPane.showMessageDialog = Exibe uma caixa de dialogo na tela e mostra
			 * uma resposta para o usuario
			 */
			JOptionPane.showMessageDialog(null,	"Divisão para cada pessoa " + divisao);
		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver quantos carros sobraram?");
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobraram " + resto + " carros");
		}
		
	}
}
