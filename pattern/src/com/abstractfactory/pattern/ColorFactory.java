package com.abstractfactory.pattern;

import com.abstractfactory.pattern.impl.Blue;
import com.abstractfactory.pattern.impl.Green;
import com.abstractfactory.pattern.impl.Red;

public class ColorFactory extends AbstractFactoryPattern {

	@Override
	public Color getColor(String color) {
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")) {
			return new Red();
		}else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}else if (color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
