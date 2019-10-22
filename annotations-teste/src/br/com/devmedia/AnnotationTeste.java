package br.com.devmedia;

import java.lang.reflect.Method;

import br.com.devmedia.annotation.Tarefa;

public class AnnotationTeste {

	public static void main(String[] args) {
		Class clazz = ClasseNegocio.class;

		for(Method method : clazz.getMethods()) {
			Tarefa tarefa = method.getAnnotation(Tarefa.class);
			if (tarefa != null) {
				System.out.println(tarefa.autor());
				System.out.println(tarefa.status());
				
			}
		}
	}

}
