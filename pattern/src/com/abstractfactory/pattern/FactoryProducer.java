package com.abstractfactory.pattern;

public  class FactoryProducer {
	public static AbstractFactoryPattern getFactoryPattern(String choice){
		if(choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
