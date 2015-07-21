package aula_0717.pokemon.gui;

import java.awt.BorderLayout;
import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela {

	private static final String CAMINHO_HEROI = "resources/heroina.png";
	
	public Tela() throws MalformedURLException {
		criaEIniciaGUI();
	}

	private void criaEIniciaGUI() throws MalformedURLException {
		//A fabrica reduz o acoplamento entre a Tela e as ImageIcon usados nos Labels
		FactoryLabels fabricaLabels = new FactoryLabels();

		JFrame frame = new JFrame("Joguinho de Pokemons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Cria objetos e eventos.
		JLabel heroina = fabricaLabels.criaJLabelIcon(CAMINHO_HEROI);
		JLabel mensagem = fabricaLabels
				.criaLabelMsg("A wild pokemon has appeared!");
		JLabel poderes = fabricaLabels.criaJLabelIcon("");

		

		// Adiciona listeners e componentes.
		frame.addKeyListener(new HeroiEvent(mensagem, poderes));
		
		JPanel msgPanel = new JPanel();
		msgPanel.add(mensagem, BorderLayout.CENTER);
		frame.getContentPane().add(heroina, BorderLayout.WEST);
		frame.getContentPane().add(msgPanel, BorderLayout.NORTH);
		frame.getContentPane().add(poderes, BorderLayout.EAST);

		frame.setSize(1000, 1000);
		frame.pack();
		frame.setVisible(true);
		frame.repaint();
	}

	public static void main(String[] args) {
		try {
			Tela tela = new Tela();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
