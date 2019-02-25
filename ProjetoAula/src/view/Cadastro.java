package view;

public class Cadastro {
	
	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Edson");
		pf.setEnd("Rua tal de tal");
		pf.setBairro("São Gonçalo");
		pf.setCep(00000000);
		pf.setCpf(88888888-8854);
		pf.setIdade(21);
		pf.setRg(99999999-99);
	
		pj.setRazaosocial("Empresa LTDA");
		pj.setBairro("Jardim Pedra Branca");
		pj.setCep(0000000-00);
		pj.setEnd("Rua Alguma Coisa");
		
		System.out.println("Pessoa Fisica");
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Endereço: " +pf.getEnd());
		System.out.println("Bairro: " +pf.getBairro());
		System.out.println("Cep: " + pf.getCep());
		System.out.println("CPF: " +pf.getcpf());
		System.out.println("Idade: " +pf.getidade());
		System.out.println("RG: " +pf.getRg());
		
		System.out.println(pj.getRazaosocial());
		System.out.println(pj.getBairro());
		System.out.println(pj.getCep());
		System.out.println(pj.getEnd());
		
		
		
		
		
		
	
	}

}
