package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProjetoCadastro extends JFrame {

	JTextField txtNome = new JTextField("");
	JLabel lblNome = new JLabel("Nome :") ;
	
	JTextField txtEnd = new JTextField("");
	JLabel lblEnd = new JLabel("Endereço :");
	
	JTextField txtCidade = new JTextField("");
	JLabel lblCidade = new JLabel("Cidade :");
	
	JTextField txtBairro = new JTextField("");
	JLabel lblBairro = new JLabel("Bairro :");
	
	JTextField txtTel = new JTextField("");
	JLabel lblTel = new JLabel("Telefone :");
	
	JTextField txtRg = new JTextField("");
	JLabel lblRg = new JLabel("RG :");
			
	
	JLabel lblSexo = new JLabel("Sexo ");
	
	JLabel lblCep = new JLabel("CEP : ");
	JTextField txtCep = new JTextField("");
	
	JLabel lblEstado = new JLabel ("ESTADO :");
	
	JLabel lblCel = new JLabel ("Celular :");
	JTextField txtCel = new JTextField("");
	
	JLabel lblCpf = new JLabel ("Cpf :");
	JTextField txtCpf = new JTextField("");
	
	JButton btnSalvar = new JButton("Salvar ");
	JButton btnImprimir = new JButton("Imprimir");
	
	
	
	
	
	
	
	public ProjetoCadastro() {
		super ("Cadastro");
		
		Container paine = getContentPane(); //Criando o Container
		paine.setLayout(null); // adicionando um layout no container
		
		
		paine.add(txtNome);
		txtNome.setBounds(90, 20, 240, 40); //(coluna, linha,espaço,altura )
		paine.add(lblNome);
		lblNome.setBounds(20, 30, 80, 20);
		
		paine.add(txtEnd);
		txtEnd.setBounds(90, 70, 240, 40); //(coluna, linha,espaço,altura )
		paine.add(lblEnd);
		lblEnd.setBounds(20, 80, 80, 20);
		
		paine.add(txtCidade);
		txtCidade.setBounds(90, 120, 240, 40); //(coluna, linha,espaço,altura )
		paine.add(lblCidade);
		lblCidade.setBounds(20, 130, 80, 20);
		
		paine.add(txtBairro);
		txtBairro.setBounds (90, 170, 240, 40); //(coluna, linha,espaço,altura )
		paine.add(lblBairro);
		lblBairro.setBounds(20, 180, 80, 20);
		
		paine.add(txtTel);
		txtTel.setBounds(90, 220, 150, 40); //(coluna, linha,espaço,altura )
		paine.add(lblTel);
		lblTel.setBounds(20, 230, 80, 20);
		
		paine.add(txtRg);
		txtRg.setBounds(90, 270, 150, 40); //(coluna, linha,espaço,altura )
		paine.add(lblRg);
		lblRg.setBounds(20, 280 , 80, 20);
		
		
		
		
		
		
		
		
		
		
		
		
		
		this.setSize(600,400); // comando que define o tamanho da janela
		this.setVisible(true); // comando que define a visualição da janela 
		this.setResizable(false);//comando que nao permite a alteração no tamanha da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comando que define que a janela seja encerrada
	}
	
	
	public static void main(String[] args) {
		ProjetoCadastro calc = new ProjetoCadastro();

	}

}
