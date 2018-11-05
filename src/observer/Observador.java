package observer;

public class Observador implements Observer {
	
	private Observable observado;
	private Double temperatura;

	public Observador(Observable obs) {
		setObservador(obs);
		setTemperatura(0D);
	}
	
	@Override
	public void update() {
		this.setTemperatura(((Observado) observado).getTemperatura());
		System.out.println(this + " Atualizado com valor > "+ this.getTemperatura());
		
	}

	private void setObservador(Observable obs) {
		observado = obs;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	private void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

}
