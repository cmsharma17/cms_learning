package comc.cms.designPattern.decorator;

public class CarDecorator implements Car{
	protected Car car;
	
	public CarDecorator(Car c){
		System.out.println("Calling CarDecorator Constructor");
		this.car = c;
	}
	
	@Override
	public void assemble() {
		this.car.assemble();
		
	}

}
