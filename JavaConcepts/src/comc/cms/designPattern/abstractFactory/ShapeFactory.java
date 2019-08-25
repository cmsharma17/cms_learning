package comc.cms.designPattern.abstractFactory;



public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}

}
