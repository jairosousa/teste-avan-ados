package br.com.devmedia.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tarefa {

	public enum Status {
		INICIADA, NAO_INICIADA
	};

	public String autor() default "Jairo";

	public Status status() default Status.NAO_INICIADA;
}
