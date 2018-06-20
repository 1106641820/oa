package com.abstractfactory.pattern.impl;

import com.abstractfactory.pattern.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue ::fill() method");
	}

}
