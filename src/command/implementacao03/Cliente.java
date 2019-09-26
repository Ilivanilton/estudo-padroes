package command.implementacao03;

public class Cliente {
	
	public static void main(String[] args) {
		ControleRemoto.init();
		ControleRemoto.acionarBotao("A");
		ControleRemoto.acionarBotao("B");		
	}


}
