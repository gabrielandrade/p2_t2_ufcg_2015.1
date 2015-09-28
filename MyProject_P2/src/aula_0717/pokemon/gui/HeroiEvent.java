package aula_0717.pokemon.gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import aula_0717.pokemon.Facade;

public class HeroiEvent extends KeyAdapter {
	//Note que com a Facade, as classes de GUI nao
	// conhece NENHUMA das classes da logica de negocios.
	private Facade facade;
	private JLabel mensagem;
	private JLabel poder;
	
	public HeroiEvent(JLabel mensagem, JLabel label){
		facade = new Facade();
		this.mensagem = mensagem;
		this.poder = label;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyChar() == 'q'){
			//Troca de Pokemons (ou o poder do pokemon)
			//facade.chamaProxPokemon();			
//			ImageIcon imagem = new ImageIcon();
//			poder.setIcon(imagem);	
			criaObjeto(facade.chamaProxPokemon());
			
		}else if(e.getKeyChar() == 'a'){
			//Usa o ataque do Pokemon
			mensagem.setText(facade.usaPoder());
			
		}else{
			mensagem.setText("Tecla Invalida");
		}
	}
	
	private void criaObjeto(String path) {
		ImageIcon imagem = new ImageIcon(path);
		poder.setIcon(imagem);		
		poder.repaint();
	}
}
