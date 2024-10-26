import java.util.ArrayList;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// ArrayList
		// Para encerrar vou digitar S de sair
		// Preencer nomes ate que o usuario decida fechar

		ArrayList<String> nomes = new ArrayList<String>();
		String opcao;
		while (true) {

			nomes.add(JOptionPane.showInputDialog("Digite um nome"));

			opcao = JOptionPane.showInputDialog("Digite S para sair...");
			if (opcao.equals("S")) {
				
			

				break;
			}
		}

		for (String nome : nomes) {
			JOptionPane.showMessageDialog(null, nome);
		}

	}

}
