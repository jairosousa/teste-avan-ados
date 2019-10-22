package br.devmedia.fixtures;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import br.devmedia.entidade.Endereco;
import br.devmedia.entidade.Pessoa;

public class FixtureLoader implements TemplateLoader {

	public void load() {
		Fixture.of(Pessoa.class).addTemplate("pessoaValida", new Rule() {{
			add("nome", random("Jairo Sousa", "Silvana", "Caio", "Jairo Filho"));
			add("idade", random(Integer.class, range(18, 110)));
			add("dtNasc", instant("18 year ago"));
			add("enderecos", has(1).of(Endereco.class, "enderecoValido"));
		}});
		
		Fixture.of(Endereco.class).addTemplate("enderecoValido", new Rule() {{
			add("rua", random("Travessa L-6","Travessa L-5"));
			add("numero", random(Integer.class, range(185, 223)));
			add("cep", random("66813-700", "66813-701", "66813-702"));
		}});
		
	}


	
}
