package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela2 extends JFrame{
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	JLabel lblEnd = new JLabel("Endereço: ");
	JTextField txtEnd = new JTextField();
	JLabel lblCEP = new JLabel("CEP :");
	JTextField txtCEP = new JTextField();
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField();
	JLabel lblEstado = new JLabel("Estado: ");
	JTextField txtEstado = new JTextField();
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	public PrimeiraTela2() {
		super("Titulo da Minha Janela");
		
		Container paine = this.getContentPane();
		
		paine.add(lblNome);
		lblNome.setBounds(160,20,100,20);
		paine.add(txtNome);
		txtNome.setBounds(200,20,200,20);
		
		paine.add(lblEnd);
		lblEnd.setBounds(160,40,100,20);
		paine.add(txtEnd);
		txtEnd.setBounds(200,40,180,20);
		
		paine.add(lblCEP);
		lblCEP.setBounds(160,60,100,20);
		paine.add(txtCEP);
		txtCEP.setBounds(200,60,160,20);
		
		paine.add(lblCidade);
		lblCidade.setBounds(160,80,100,20);
		paine.add(txtCidade);
		txtCidade.setBounds(200,80,140,20);
		
		paine.add(lblEstado);
		lblEstado.setBounds(160,100,100,20);
		paine.add(txtEstado);
		txtEstado.setBounds(200,100,120,20);
		
		paine.add(lblBairro);
		lblBairro.setBounds(160,120,100,20);
		paine.add(txtBairro);
		txtBairro.setBounds(200,120,100,20);
	
		this.setLayout(null);
		this.setSize(600, 300 );
		//this.setResizable(0);
		this.setVisible(true);
		
		
	}
	public static void main(String args[]) {
		PrimeiraTela2 tela = new PrimeiraTela2();
	}
}