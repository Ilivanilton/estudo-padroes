package FactoryMethod;

public class ConcretCreator extends Creator {

	@Override
	Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcretProdutc();
	}
	
}
