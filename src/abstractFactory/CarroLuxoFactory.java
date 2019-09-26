package abstractFactory;

public class CarroLuxoFactory implements CarroFactory {

	@Override
	public Roda montarRoda() {
		// TODO Auto-generated method stub
		return new RodaLigaLeve();
	}

	@Override
	public Som montarSom() {
		// TODO Auto-generated method stub
		return new SomCDPlay();
	}

}
