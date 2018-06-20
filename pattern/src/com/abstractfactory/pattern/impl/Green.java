package com.abstractfactory.pattern.impl;

import com.abstractfactory.pattern.Color;

public class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Green ::fill() method");
	}

}
