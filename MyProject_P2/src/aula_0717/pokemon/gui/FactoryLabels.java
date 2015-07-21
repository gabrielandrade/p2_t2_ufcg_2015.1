package aula_0717.pokemon.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FactoryLabels {

	public JLabel criaJLabelIcon(String caminhoImagem){
		ImageIcon image;
		if(caminhoImagem.equals("")){
			//Jlabel com imagem vazia que ira mudar.
			image = new ImageIcon();
		}else{
			image = new ImageIcon(caminhoImagem);
		}
		return new JLabel(image);
	}
	
	public JLabel criaLabelMsg(String mensagem){
		return new JLabel(mensagem);
	}
	
}
