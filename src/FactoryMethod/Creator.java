package FactoryMethod;

public abstract class Creator {

	abstract Product factoryMethod();
	
	public void onOperation(){
		System.out.println("Comportamento que opera o retorno"
				+ "da função factoryMethod()");
		
		Product produto = this.factoryMethod();
		
		System.out.println("Nome do produto: " + 
				produto.getName());
		
	}
	

}
