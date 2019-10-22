package com.devmedia.tdd_devmedia.bo;

public class ManipulaString {
	
	private static final String VOGAIS = "aeiou";

	public String manipular(String string) {
		for (char c : string.toCharArray()) {
			if (isVogal(c)) {
				return "9";
			}
		}
		return string;
	}

	public boolean isVogal(char caractere) {
		return VOGAIS.contains(String.valueOf(caractere));
	}
}
