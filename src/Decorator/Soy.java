package Decorator;

public class Soy extends CondimentDecorator {
	
	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 2.25 + beverage.cost();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

}
