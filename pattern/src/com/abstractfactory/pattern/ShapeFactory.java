package com.abstractfactory.pattern;

import com.abstractfactory.pattern.impl.Circle;
import com.abstractfactory.pattern.impl.Rectangle;
import com.abstractfactory.pattern.impl.Square;

public class ShapeFactory extends AbstractFactoryPattern {


	@Override
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
