package Command.implementacao01;

import Command.AbrirPortaoCommand;
import Command.Command;
import Command.FecharPortaoCommand;
import Command.PortaoAutomatico;

public class Main {
	
	//client
	public static void main(String[] args) {
		/*
		 * 				input
		 */
		// Receptor
		PortaoAutomatico portaoAutomatico = new PortaoAutomatico();
		// CommandConcret
		Command abrirPortao = new AbrirPortaoCommand(portaoAutomatico);
		Command fecharPortao = new FecharPortaoCommand(portaoAutomatico);
		// invoker
		ControleRemoto controleRemoto = new ControleRemoto();
		
		/*
		 * 				logica
		 */
		controleRemoto.setCommad(abrirPortao);
		//controleRemoto.setCommad(fecharPortao);
		
		/*
		 * 				out
		 */
		controleRemoto.executeComando();

	}
	
	

}
