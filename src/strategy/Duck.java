package strategy;

public abstract class Duck{

	FlyBehavior  flyBehavior;
	//Behavior = Comportamento
	
	public abstract void display();
	
	//Perform = realizar
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("pata nadando...");
	}
	
}
