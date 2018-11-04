package strategy;

public class MallardDuck extends Duck{

	public MallardDuck(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	@Override
	public void display() {
		System.out.println("pato voa");
		
	}
	
	
}
