package decorator;

public class Expresso extends Beverage {
	public Expresso() {
		this.description = "Expresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
	
}
