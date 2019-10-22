package com.devmedia.tdd_devmedia;

import org.junit.Assert;
import org.junit.Test;

import com.devmedia.tdd_devmedia.bo.ManipulaString;

public class StringVogaisTest {
	
	@Test
	public void lidaComStringVazia() {
		String string = "";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("", validado);
	}

	@Test
	public void lidaComStringSemVogais() {
		String string = "bcd";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("bcd", validado);
	}
	
	@Test
	public void lidaComStringComUmaVogais() {
		String string = "a";
		
		ManipulaString manipulaString = new ManipulaString();
		String validado = manipulaString.manipular(string);
		
		Assert.assertEquals("9", validado);
	}
}
