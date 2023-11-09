package org.paumard.designpattern.factory;

import org.paumard.designpattern.factory.factory.Factory;
import org.paumard.designpattern.factory.model.Rectangle;
import org.paumard.designpattern.factory.registry.SwitchRegistry;

public class PlayWithSwitchRegistry {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SwitchRegistry registry = new SwitchRegistry();
		
		Factory<Rectangle> rectangleFactory = 
				(Factory<Rectangle>)registry.buildShapeFactory("rectangle");
		System.out.println("Rectangle : " + rectangleFactory.newInstance());
	}
}
