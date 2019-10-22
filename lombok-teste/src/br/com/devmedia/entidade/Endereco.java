package br.com.devmedia.entidade;

import java.util.Set;

import lombok.Builder;
import lombok.Singular;
import lombok.ToString;

@Builder
@ToString
public class Endereco {

	private String cidade;
	
	private int numero;
	
	@Singular
	private Set<String> pessoas;
}
