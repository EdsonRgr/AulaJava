package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao extends JFrame{
	JButton btnCadPF = new JButton("Cadastrar Pessoa Física");
	JButton btnCadPJ = new JButton("Cadastrar Pessoa Jurídica");
	
	public Execucao() {
		super("Tela de Cadastro");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		btnCadPF.setBounds(100, 50, 200, 100); // coluna, linha, largura, altura 
		btnCadPF.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.PessoaFisica pf = new view.PessoaFisica();
			}
		});
		paine.add(btnCadPF);
		
		btnCadPJ.setBounds(100, 180, 200, 100);
		btnCadPJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.PessoaJuridica pf = new view.PessoaJuridica();
			}
		});
		paine.add(btnCadPJ);
		
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execucao exec = new Execucao();
		
	}

}
