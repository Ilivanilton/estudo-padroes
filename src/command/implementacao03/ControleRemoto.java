package command.implementacao03;

import java.util.HashMap;
import java.util.Map;

import command.AbrirPortaoCommand;
import command.Command;
import command.FecharPortaoCommand;
import command.PortaoAutomatico;

public class ControleRemoto {
	
	private static Map<String, Command> botoes = 
			new HashMap<String, Command>();
	
	public static void init() {
		PortaoAutomatico portaoAutomatico = new PortaoAutomatico();
		botoes.put("A", new AbrirPortaoCommand(portaoAutomatico));
		botoes.put("B", new FecharPortaoCommand(portaoAutomatico));
	}

	public static void acionarBotao(String botao) {
		botoes.get(botao).execute();
	}
	
}
