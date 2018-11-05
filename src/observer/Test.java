package observer;

public class Test {
	public static void main(String[] args) {
		Observado observado = new Observado(10D);
		
		Observador obs1 = new Observador(observado);
		Observador obs2 = new Observador(observado);
		Observador obs3 = new Observador(observado);
		
		observado.registerObserver(obs1);
		observado.registerObserver(obs2);
		observado.registerObserver(obs3);
		
		observado.notfyObservers();
		System.out.println("==================================");
		observado.removeObserver(obs3);
		observado.setTemperatura(20D);
		System.out.println(obs1.getTemperatura());
		observado.notfyObservers();
		System.out.println(obs1.getTemperatura());
	}
}
