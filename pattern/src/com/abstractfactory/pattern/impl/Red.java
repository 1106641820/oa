package com.abstractfactory.pattern.impl;

import com.abstractfactory.pattern.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red ::fill() method");
	}

}
