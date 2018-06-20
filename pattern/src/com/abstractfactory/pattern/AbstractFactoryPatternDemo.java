package com.abstractfactory.pattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactoryPattern shapeFactory = FactoryProducer.getFactoryPattern("SHAPE");
		Shape shape1 = shapeFactory.getShape("Rectangle");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("Square");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("Circle");
		shape3.draw();
		
		AbstractFactoryPattern colorFactory = FactoryProducer.getFactoryPattern("COLOR");
		Color color1 = colorFactory.getColor("Red");
		color1.fill();
		Color color2 = colorFactory.getColor("Green");
		color2.fill();
		Color color3 = colorFactory.getColor("Blue");
		color3.fill();
	}
}
