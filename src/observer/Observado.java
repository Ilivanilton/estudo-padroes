package observer;

import java.util.ArrayList;

public class Observado implements Observable {

	private ArrayList<Observer> observadores;
	private Double temperatura;

	public Observado(Double temperatura) {
		this.setTemperatura(temperatura);
		observadores = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer obs) {
		observadores.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		int idx = observadores.indexOf(obs);
		observadores.remove(idx);
	}

	@Override
	public void notfyObservers() {
		for (int i = 0; i < observadores.size(); i++) {
			Observer obs = (Observer) observadores.get(i);
			obs.update();
		}

	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}
}
