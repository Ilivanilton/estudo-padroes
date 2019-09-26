package decorator;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		this.description = "House Blend Coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
