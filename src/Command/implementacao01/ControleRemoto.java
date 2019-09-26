package Command.implementacao01;

import Command.Command;

public class ControleRemoto {

	private Command command;

	public void setCommad(Command abrirPortao) {
		this.command = abrirPortao;
		
	}

	public void executeComando() {
		this.command.execute();
		
	}

}
