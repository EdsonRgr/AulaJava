package model;

public class PessoaFisica extends Pessoa{
	private String nome;
	private double cpf;
	private double dataNasc;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public double getdataNasc() {
		return dataNasc;
	}
	public void setdataNasc(double dataNasc) {
		this.dataNasc = dataNasc;
	}
	
}
