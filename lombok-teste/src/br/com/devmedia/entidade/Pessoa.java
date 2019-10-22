package br.com.devmedia.entidade;

import lombok.Data;

@Data
public class Pessoa {

	private final String nome;
	private final int idade;
	private char sexo;

}
