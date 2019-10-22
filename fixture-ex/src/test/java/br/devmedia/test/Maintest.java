package br.devmedia.test;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import br.devmedia.entidade.Pessoa;

public class Maintest {

	@BeforeClass
	public static void setUp() {
		FixtureFactoryLoader.loadTemplates("br.devmedia.fixtures");
	}
	
	@Test
	public void test() {
		Pessoa pessoa = Fixture.from(Pessoa.class).gimme("pessoaValida");
		List<Pessoa> pessoas = Fixture.from(Pessoa.class).gimme(2, "pessoaValida");
		System.out.println(pessoas);
	}

}
