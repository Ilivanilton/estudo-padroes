package command.implementacao02;

import java.util.HashMap;
import java.util.Map;

import command.AbrirPortaoCommand;
import command.Command;
import command.FecharPortaoCommand;
import command.PortaoAutomatico;

public class Invoker {
	
	private static Map<String, Command> comandos = 
			new HashMap<String, Command>();

	static {
		PortaoAutomatico pA = new PortaoAutomatico();
		comandos.put("A", new AbrirPortaoCommand(pA));
		comandos.put("B", new FecharPortaoCommand(pA));
	}

	public static void invoke(String command) {
		comandos.get(command).execute();
		
	}

}
