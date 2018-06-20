package com.factory.pattern.impl;

import com.factory.pattern.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square :: draw() method.");
	}
}
