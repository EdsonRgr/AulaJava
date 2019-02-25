package view2;

import java.awt.Container;

import javax.swing.JFrame;

public class Janela extends JFrame{
	public Janela() {
		super ("Nome da janela"); // o comando super descreve o nome da janela 
		Container paine = this.getContentPane();// Criando o Container 
		paine.setLayout(null);// 
		this.setSize(400,400); // comando que define o tamanho da janela
		this.setVisible(true); // comando que define a visualição da janela 
		this.setResizable(false);//comando que nao permite a alteração no tamanha da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comando que define que a janela seja encerrada
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Janela janela1 = new Janela();
		
		

	}

}
