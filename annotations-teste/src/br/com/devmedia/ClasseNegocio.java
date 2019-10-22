package br.com.devmedia;

import br.com.devmedia.annotation.Tarefa;
import br.com.devmedia.annotation.Tarefa.Status;

public class ClasseNegocio {

	@Tarefa(autor = "Ana")
	public void metodoNegocio() {
		
		
	}
	
	@Tarefa(autor = "Clara", status = Status.INICIADA)
	public void metodoNegocio2() {
		
		
	}
}
