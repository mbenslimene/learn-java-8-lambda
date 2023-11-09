package org.paumard.designpattern.factory.registry;

import org.paumard.designpattern.factory.factory.Factory;
import org.paumard.designpattern.factory.model.Rectangle;
import org.paumard.designpattern.factory.model.Shape;
import org.paumard.designpattern.factory.model.Square;
import org.paumard.designpattern.factory.model.Triangle;

public class SwitchRegistry {

	public Factory<? extends Shape> buildShapeFactory(String shape) {
		
		switch(shape) {
			case "square" : return () -> new Square();
			case "triangle" : return () -> new Triangle();
			case "rectangle" : return () -> new Rectangle();
			default:
				throw new IllegalArgumentException("Unknown shape: " + shape);
		}
	}
}
