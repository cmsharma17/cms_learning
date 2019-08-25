package comc.cms.designPattern.decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println("Adding features of Luxury CAR");
	}

}
