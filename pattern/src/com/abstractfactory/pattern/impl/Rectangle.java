package com.abstractfactory.pattern.impl;

import com.abstractfactory.pattern.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle :: draw() method" );
	}

}
