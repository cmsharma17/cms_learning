package comc.cms.designPattern.abstractFactory;

public class AbstractFactoryPatternDemo {
	public static void main(String args[]){
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
	}
}
