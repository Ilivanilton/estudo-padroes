package abstractFactory;

public class CarroPopularFactory implements CarroFactory {

	@Override
	public Roda montarRoda() {
		// TODO Auto-generated method stub
		return new RodaSimples();
	}

	@Override
	public Som montarSom() {
		// TODO Auto-generated method stub
		return new SomTocaFitas();
	}

}
