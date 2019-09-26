package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PessoaFisica extends JFrame{
	JLabel lblNome = new JLabel("Nome : ");
	JTextField txtNome = new JTextField();
	
	JLabel lblDataN = new JLabel("Data de Nascimento :");
	JTextField txtDataN = new JTextField();
	
	JLabel lblCpf = new JLabel("CPF : ");
	JTextField txtCpf = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado :");
	JTextField txtEstado = new JTextField();
	
	JLabel lblCidade = new JLabel("Cidade : ");
	JTextField txtCidade = new JTextField();
	
	JLabel lblEnd = new JLabel("Endereço : ");
	JTextField txtEnd = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro : ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblTel = new JLabel("Telefone : ");
	JTextField txtTel = new JTextField();
	
	
	
	
	JButton btnCad = new JButton("Cadastrar");
	
	public PessoaFisica() {
		super("Tela de Cadastro - Pessoa Física");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblNome.setBounds(20, 20, 80, 20); // coluna, linha, largura, altura 
		paine.add(lblNome);
		
		txtNome.setBounds(80, 20, 200, 20);
		paine.add(txtNome);
		
		lblDataN.setBounds(20, 50, 120, 20);
		paine.add(lblDataN);
		
		txtDataN.setBounds(200, 50, 80, 20);
		paine.add(txtDataN);
		
		lblCpf.setBounds(20, 80, 80, 20);
		paine.add(lblCpf);
		
		txtCpf.setBounds(130, 80, 150, 20);
		paine.add(txtCpf);
		
		lblTel.setBounds(20, 110, 80, 20);
		paine.add(lblTel);
		
		txtTel.setBounds(130, 110, 150, 20);
		paine.add(txtTel);
		
		lblEstado.setBounds(300, 20, 80, 20);
		paine.add(lblEstado);
		
		txtEstado.setBounds(400, 20, 150, 20);
		paine.add(txtEstado);
		
		lblCidade.setBounds(300, 50, 80, 20);
		paine.add(lblCidade);
		
		txtCidade.setBounds(400, 50, 150, 20);
		paine.add(txtCidade);
		
		lblEnd.setBounds(300, 80, 80, 20);
		paine.add(lblEnd);
		
		txtEnd.setBounds(400, 80, 170, 20);
		paine.add(txtEnd);
		
		lblBairro.setBounds(300, 110, 80, 20);
		paine.add(lblBairro);
		
		txtBairro.setBounds(400, 110, 150, 20);
		paine.add(txtBairro);

		
		btnCad.setBounds(250, 200, 100, 50);
		paine.add(btnCad);
		btnCad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				model.PessoaFisica pf = new model.PessoaFisica();
				pf.setNome(txtNome.getText());
				pf.setCpf(Double.parseDouble(txtCpf.getText()));
				pf.setdataNasc(Double.parseDouble(txtDataN.getText()));
				pf.setTelefone(Double.parseDouble(txtTel.getText()));
				pf.setEstado(txtEstado.getText());
				pf.setCidade(txtCidade.getText());
				pf.setEndereco(txtEnd.getText());
				pf.setBairro(txtBairro.getText());
				
				
				
				JOptionPane.showMessageDialog(null, "Nome: " + pf.getNome() +"\n Data de Nascimento:"+ pf.getdataNasc() +"\n Cpf: " + pf.getCpf());
			}
		});
		
		this.setSize(600, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
