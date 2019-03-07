package view2;

import java.awt.Container; // biblioteca para o container 
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; // biblioteca para os bot�es
import javax.swing.JFrame;
import javax.swing.JTextField; 
import view2.OperacoesMat;


public class Janela extends JFrame{
	
	JTextField txtresult = new JTextField("0");
	JButton btnExibir = new JButton("Exibir ");
	JButton btnEditar = new JButton("Editar ");
	JButton btnAjuda = new JButton("Ajuda ");
	
	
	
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	
	JButton btnApagar = new JButton("<--");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMoM = new JButton("+/-");
	JButton btnRQ = new JButton("RQ");
	
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDiv = new JButton("/");
	JButton btnPor = new JButton("%");
	
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMult = new JButton("*");
	JButton btnFrac = new JButton("1/x");
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnSub = new JButton("-");
	
	JButton btn0 = new JButton("0");
	JButton btnPont = new JButton(".");
	JButton btnSom= new JButton("+");
	JButton btnIgual = new JButton("=");
	
	OperacoesMat mat = new OperacoesMat();
	String sinal= null;
	double valor1 = 0, valor2 = 0 ;
	

	public Janela() {
		super ("Calc Win7"); // o comando super descreve o nome da janela
		Container paine = this.getContentPane();// Criando o Container 
		paine.setLayout(null);// para nao trabalhar com nenhum layout
		
		paine.add(txtresult);
		txtresult.setBounds(10 , 30, 322, 50);
		
		//painel 
		paine.add(btnExibir);
		btnExibir.setBounds(10, 2, 110, 30);
		
		paine.add(btnEditar);
		btnEditar.setBounds(120, 2, 110, 30);
		
		paine.add(btnAjuda);
		btnAjuda.setBounds(220,2,110,30);
		
		
		
		//primeira linha
		paine.add(btnMC);
		btnMC.setBounds(10 ,80 , 60, 40); // (coluna, linha,espa�o,altura ) 
		
		paine.add(btnMR);
		btnMR.setBounds(75 ,80 , 60, 40);
		
		paine.add(btnMS);
		btnMS.setBounds(140 ,80 , 60, 40);
		
		paine.add(btnMmenos);
		btnMmenos.setBounds(205 ,80 , 60, 40);
		
		paine.add(btnMmais);
		btnMmais.setBounds(270 ,80 , 60, 40);
		
	
		//segunda linha
		paine.add(btnApagar);
		btnApagar.setBounds(10, 125, 60, 40);
		
		paine.add(btnCE);
		btnCE.setBounds(75, 125, 60, 40);
		btnCE.addActionListener(new ActionListener() {   //colocando o bot�o para funcionar 
			public void actionPerformed(ActionEvent e) {

				txtresult.setText("0");
				
			}
		});
		
		
		paine.add(btnC);
		btnC.setBounds(140 ,125 , 60, 40);
		
		paine.add(btnMoM);
		btnMoM.setBounds(205,125 , 60, 40);
		
		paine.add(btnRQ);
		btnRQ.setBounds(270 ,125 , 60, 40);
		
		
		//terceira linha
		paine.add(btn7);
		btn7.setBounds(10 ,170 , 60, 40);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {   // se o txtresult estiver com o valor 0 add 7
					txtresult.setText("7");
				}else {
					txtresult.setText(txtresult.getText() + "7"); // caso ja tenho um valor add num7 
				}
				
				
			}
		});
		
		paine.add(btn8);
		btn8.setBounds(75 ,170, 60, 40);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("8");
				}else {
					txtresult.setText(txtresult.getText() + "8");
				}
				
				
			}
		});
		
		
		paine.add(btn9);
		btn9.setBounds(140 ,170 , 60, 40);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("9");
				}else {
					txtresult.setText(txtresult.getText() + "9");
				}
				
				
			}
		});
		
		
		paine.add(btnDiv);
		btnDiv.setBounds(205 ,170 , 60, 40);
		
		paine.add(btnPor);
		btnPor.setBounds(270 ,170 , 60, 40);
		
		
		//Quarta linha
		paine.add(btn4);
		btn4.setBounds(10 ,215 , 60, 40);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("4");
				}else {
					txtresult.setText(txtresult.getText() + "4");
				}
				
				
			}
		});
		
		
		paine.add(btn5);
		btn5.setBounds(75 ,215, 60, 40);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("5");
				}else {
					txtresult.setText(txtresult.getText() + "5");
				}
				
				
			}
		});
		
		
		paine.add(btn6);
		btn6.setBounds(140 ,215, 60, 40);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("6");
				}else {
					txtresult.setText(txtresult.getText() + "6");
				}
				
				
			}
		});
		
		
		paine.add(btnMult);
		btnMult.setBounds(205 ,215 , 60, 40);
		
		paine.add(btnFrac);
		btnFrac.setBounds(270 ,215 , 60, 40);
		
	
		//Quinta linha
		paine.add(btn1);
		btn1.setBounds(10 ,260 , 60, 40);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("1");
				}else {
					txtresult.setText(txtresult.getText() + "1");
				}
				
				
			}
		});
		
		
		paine.add(btn2);
		btn2.setBounds(75 ,260, 60, 40);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("2");
				}else {
					txtresult.setText(txtresult.getText() + "2");
				}
				
				
			}
		});
		
		
		paine.add(btn3);
		btn3.setBounds(140 ,260 , 60, 40);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("3");
				}else {
					txtresult.setText(txtresult.getText() + "3");
				}
				
				
			}
		});
		
		
		paine.add(btnSub);
		btnSub.setBounds(205 ,260 , 60, 40);
		
		
		//Sexta linha
		paine.add(btn0);
		btn0.setBounds(10 ,305 , 125, 40); // (coluna, linha,espa�o,altura )
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtresult.getText().equals("0")) {
					txtresult.setText("0");
				}else {
					txtresult.setText(txtresult.getText() + "0");
				}
				
				
			}
		});
		
		
		paine.add(btnPont);
		btnPont.setBounds(140 ,305, 60, 40);
		
		paine.add(btnSom);
		btnSom.setBounds(205 ,305 , 60, 40);
		btnSom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtresult.getText());
				sinal = "soma";
				txtresult.setText("0");
			}
		});
		
		paine.add(btnIgual);
		btnIgual.setBounds(270 ,260 , 60, 85);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor2 = Double.parseDouble(txtresult.getText());

				if(sinal.equals("soma")) {
					txtresult.setText(mat.soma(valor1, valor2) + "");
				}
				
			}
		});
		
		
		this.setSize(350,400); // comando que define o tamanho da janela
		this.setVisible(true); // comando que define a visuali��o da janela 
		this.setResizable(false);//comando que nao permite a altera��o no tamanha da janela
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//comando que define que a janela seja encerrada
		
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
	
	}
	public static void main(String[] args) {
		Janela janela1 = new Janela();
		
		

	}

}
