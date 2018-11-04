package strategy;



public class Main {

	public static void main(String[] args) {
		Duck d = new MallardDuck(new FlyWithWings());
		d.display();
		d.performFly();

	}

}
