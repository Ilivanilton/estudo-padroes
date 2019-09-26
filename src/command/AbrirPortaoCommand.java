package command;

public class AbrirPortaoCommand implements Command {

	private PortaoAutomatico receptor;

	public AbrirPortaoCommand(PortaoAutomatico portaoAutomatico) {
		this.receptor =  portaoAutomatico;
	}

	@Override
	public void execute() {
		this.receptor.abrir();

	}

}
