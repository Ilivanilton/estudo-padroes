package Command.implementacao02;

import java.util.HashMap;
import java.util.Map;

import Command.AbrirPortaoCommand;
import Command.Command;
import Command.FecharPortaoCommand;
import Command.PortaoAutomatico;

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
