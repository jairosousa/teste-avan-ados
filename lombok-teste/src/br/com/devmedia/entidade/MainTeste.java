package br.com.devmedia.entidade;

public class MainTeste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jairo", 12);
		pessoa.setSexo('M');
		
		System.out.println(pessoa);
		
		Endereco endereco = Endereco.builder()
				.cidade("Belém")
				.numero(223)
				.pessoa("Jairo")
				.pessoa("Silvana")
				.build();
		System.out.println(endereco);
		

	}

}
